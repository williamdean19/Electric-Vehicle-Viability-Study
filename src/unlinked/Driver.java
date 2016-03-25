package unlinked;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	@SuppressWarnings("unchecked")
	public static void main (String args[]) 
	{
		//int j;

		//unlinkedTrips is an ArrayList that holds the entire csv file
		ArrayList<UnlinkedTrip> unlinkedTrips = new ArrayList<UnlinkedTrip>();



		//read the csv file in:
		unlinkedTrips = CsvFileReader.unlinkedTripCsvFileToArrayList("UNLINKED_Public.csv");


		//confirm that there are the same number of entries in unlinkedTrips array list as there are rows in the csv file:
		System.out.println("There are " + unlinkedTrips.size() + " Records in the unlinkedTrips ArrayList");

		//Print out some data to be confident that everything is where it should be in the unlinkedTrips array list:
		System.out.println("HCITY_MCD for entry 188199 is " + unlinkedTrips.get(188198).getHCITY_MCD() + "");

		//autoSegments is an ArrayList that holds only the trips and the associated attributes we are interested in for our study
		ArrayList<AutoTripSegment> autoSegments = new ArrayList<AutoTripSegment>();

		//Start filling the autoSegments ArrayList:
		for (int i = 0; i < unlinkedTrips.size(); i++)
		{

			/* We are only interested only in drivers of automobiles (ULTMODE = 5)
			 * this prevents duplicate tours appearing in our data (each trip segment only has 1 driver)
			 * Since we are interested in seeing how individual vehicles behave throughout the day it is more useful
			 * to look at the driving patterns of the vehicles themselves to see if they are capable of meeting the demands
			 * of what would be required of it if it were an electric vehicle.
			 * 
			 * Later on, we could possibly look at the number of occupants and
			 * how DTPURP_AGG = 4 (Escorting) (ie - driving people around)
			 * affects the demands of the tour to be met by an electric vehicle			
			 */

			if(unlinkedTrips.get(i).getULTMODE().equals("5"))
			{
				AutoTripSegment autoSegment = new AutoTripSegment(unlinkedTrips.get(i));
				autoSegments.add(autoSegment);
			}
		}
		//Print out how many auto trip segments we are left with:
		System.out.println("There are " + autoSegments.size() + " auto trip segments in the autoSegments ArrayList");

		//household is an ArrayList of AutoTripSegments such that all AutoTripSegments that belong to household all have the same household identifier (SAMPN)
		ArrayList<AutoTripSegment> household = new ArrayList<AutoTripSegment>();
		//householdCollection is a general arrayList that is used to hold ArrayLists of AutoTripSegments that all belong to the same household
		ArrayList <ArrayList<AutoTripSegment>> householdCollection = new ArrayList <ArrayList<AutoTripSegment>> ();

		//hhCount is a tester variable, just making sure we have the right number of households being made
		int hhCount = 0;

		//Loop goes as long as there are autoSegments to be compiled into households
		for(int i = 0; i < autoSegments.size(); i++)
		{
			if ((i == autoSegments.size() - 1) || !(autoSegments.get(i).getSAMPN().equals(autoSegments.get(i+1).getSAMPN())) )
			{
				//Add the last trip to this household
				household.add(autoSegments.get(i));
				//Add the completed household to householdCollection
				householdCollection.add(household);
				//reset the household ArrayList to be empty for the next household
				household = new ArrayList<AutoTripSegment>();
				hhCount++;
			}
			else
			{
				//add this trip to the current household
				household.add(autoSegments.get(i));

				//go to the next element
			}
		}
		//Some statements to confirm our calculations thus far:
		boolean multHH = false;
		int multHHs = 0;
		System.out.println("There are " + hhCount + " households in the autoSegments array list");
		System.out.println("There are " + householdCollection.size() + " households in the householdCollection array list");
		for (int i = 0; i < householdCollection.size(); i++)
		{
			for(int j = 0; j < ((ArrayList<AutoTripSegment>) householdCollection.get(i)).size()-1; j++)
			{
				if(!((ArrayList<AutoTripSegment>) householdCollection.get(i)).get(j).getSAMPN().equals(((ArrayList<AutoTripSegment>) householdCollection.get(i)).get(j+1).getSAMPN()))
					multHH = true;
			}
			if (multHH == true)
			{
				multHHs++;
			}
		}
		System.out.println("There are " + multHHs + " Households that have more than one SAMPN in the autoTourCollection ArrayList.  THIS MUST BE 0" + "\n");

		//for now householdCollection is an ArrayList that holds collections of AutoTripSegments that share a common SAMPN (household identifier) 
		//We find out how many tours the household made then we sort those tours by VEHNO (vehicle number for that household)
		//We make an Auto class based on the collection of tours made by each unique vehicle (identified by their VEHNO)

		//autoTourAttrib will be the ArrayList we pass to the constructor
		ArrayList<AutoTripSegment> autoTourAttrib = new ArrayList<AutoTripSegment>();
		//autoTourCollection will be the ArrayList that holds the tours as they are completed
		ArrayList <AutoTour> autoTourCollection = new ArrayList<AutoTour>();
		//Declare an AutoTour object with a null ArrayList
		AutoTour at = new AutoTour(autoTourAttrib);

		//we need to pull out the tours from every house hold, so we will make a for loop to process every household in the householdCollection
		for (int i = 0; i < householdCollection.size(); i++)
		{
			//get the household and loop through the collection of trips contained within
			ArrayList<AutoTripSegment> curHH = new ArrayList <AutoTripSegment>();
			curHH = (ArrayList<AutoTripSegment>) householdCollection.get(i);
			autoTourAttrib = new ArrayList<AutoTripSegment>();

			boolean firstTripOfHH = true;

			//make a loop that keeps going as long as there are more trips in curHH
			for (int j = 0; j < curHH.size(); j++)
			{
				//get the LTRIPNO from the current trip segment. if it is == 1, the autoTourAttrib arraylist we have been adding to is complete
				//we might want to change this to be curLtripNo != (prevLtripNo += 1) because as shown in the data, if someone walks to their car
				//as their first trip of the tour they are on, the first trip of the autotour might not have linked trip no = 1
				int curLTripNo = Integer.parseInt(curHH.get(j).getLTRIPNO());

				if(curLTripNo == 1 && firstTripOfHH == false)
				{
					at = new AutoTour(autoTourAttrib);
					autoTourCollection.add(at);
					autoTourAttrib = new ArrayList<AutoTripSegment>();
					//add the current trip to the autoTourAttrib arraylist for the tour we are constructing
					autoTourAttrib.add(curHH.get(j));
				}
				else
				{
					autoTourAttrib.add(curHH.get(j));
					firstTripOfHH = false;
				}
			}

			//the autoTourAttrib list coming out of the while loop still needs to be made into a tour

			at = new AutoTour(autoTourAttrib);
			autoTourCollection.add(at);


		}

		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-1)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-2)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-3)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-4)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-5)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-6)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-7)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-900)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-901)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-902)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-1785)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-1786)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-1788)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-2522)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-2523)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-2524)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-2525)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-20099)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-20100)).toString());
		System.out.println(((AutoTour) autoTourCollection.get(autoTourCollection.size()-20101)).toString());

		//Display count data before trimming:
		StaticMethods.displayAutoTourCollectionData(autoTourCollection);

		//Take out of our collection any tours with bad data (trim the data)
		StaticMethods.trimAutoTourCollectionData(autoTourCollection);

		//Display count data after trimming:
		StaticMethods.displayAutoTourCollectionData(autoTourCollection);



		//automobileAttrib is the arraylist consisting of auto tours passed to the automobile constructor
		//every tour in automobileAttrib must have household number the same, as well as vehicle number the same
		ArrayList <AutoTour> automobileAttrib = new ArrayList<AutoTour> ();

		// Once all tours from the same hh/using the same vehicle have been added to automobileAttrib, 
		// create the automobile object and add it to the automobile collection
		// We will be done filling automobile collection when there are no more tours left to make into vehicles
		ArrayList <Automobile> automobileCollection = new ArrayList<Automobile>();

		ArrayList<AutoTour> autoToursByHousehold = new ArrayList <AutoTour> ();

		for(int i = 0; i < autoTourCollection.size(); i++)
		{
			if ((i == autoTourCollection.size() - 1) || !(autoTourCollection.get(i).getTrips().get(0).getSAMPN().equals(autoTourCollection.get(i+1).getTrips().get(0).getSAMPN())) )
			{
				autoToursByHousehold.add(autoTourCollection.get(i));
				//The entries will be sorted by vehicle number, so we can just go in order til the next one is not the current one
				Collections.sort(autoToursByHousehold, new AutoTourComparator());
				//get the vehicles out here/now
				for(int j = 0; j < autoToursByHousehold.size(); j++)
				{
					if ((j == autoToursByHousehold.size() - 1) || !(autoToursByHousehold.get(j).getTrips().get(0).getVEHNO().equals(autoToursByHousehold.get(j+1).getTrips().get(0).getVEHNO())) )
					{
						automobileAttrib.add(autoToursByHousehold.get(j));

						Automobile newAutomobile = new Automobile(automobileAttrib);
						automobileCollection.add(newAutomobile);

						automobileAttrib = new ArrayList<AutoTour> ();
					}
					else
					{
						automobileAttrib.add(autoToursByHousehold.get(j));
					}
				}
				//start a new household
				autoToursByHousehold = new ArrayList <AutoTour>();
			}
			else
			{
				//add this trip to the current household
				autoToursByHousehold.add(autoTourCollection.get(i));
			}
		}

		System.out.println("There are: " + automobileCollection.size() + " automobiles in the automobileCollection ArrayList.");

		// Now read in from the vehicle .csv file and count how many vehicles there are such that they are automobiles, and they were used
		// This number should be very close to the number of automobiles there are in automobileCollection
		{

			ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
			vehicles = CsvFileReader.vehicleCsvFileToArrayList("VEH_Public.csv");

			StaticMethods.trimVehicleArrayListToUsedAutomobiles(vehicles);
			
			System.out.println("There are " + vehicles.size() + " automobiles that were used in the vehicles.csv file.") ;
		}
		
		int numInvalidAutomobiles = 0;
		int numPotentialElectricAutomobiles = 0;
		
		for (int i = 0; i < automobileCollection.size(); i++)
		{
			if (automobileCollection.get(i).isValidAutomobile() == false)
			{
				numInvalidAutomobiles++;
			}
			
			if(automobileCollection.get(i).meetsElectricVehicleRequirements())
			{
				numPotentialElectricAutomobiles++;
			}
			
			//System.out.println(automobileCollection.get(i).toString());
			
		}

		System.out.println("The number of invalid automobiles is: " + numInvalidAutomobiles + "\n" +
							"The number of potentially electric vehicles is: " + numPotentialElectricAutomobiles
				);
		
		
		System.out.println("End of testing!!!");

	}
}

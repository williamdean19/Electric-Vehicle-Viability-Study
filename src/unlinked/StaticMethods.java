package unlinked;

import java.util.ArrayList;

public class StaticMethods {

	static void displayAutoTourCollectionData(
			ArrayList<AutoTour> autoTourCollection) {
		{
			int incompleteTours = 0;
			int toursWithMultVehicles = 0;
			int toursWithMultHH = 0;
			int faultyLTripNoSequences = 0;
			int toursWithMultHHAndFaultyTripNoSequences = 0;
			int skippedTours = 0;
			double avgAutoTourDistance = 0.0;
			double avgAutoTourDuration = 0.0;
			double avgAutoTourTravelTime = 0.0;
			double avgAutoTourActivityTime = 0.0;

			StaticMethods.countAutoTourCollectionAttributes(autoTourCollection, incompleteTours,
					toursWithMultVehicles, toursWithMultHH, faultyLTripNoSequences,
					toursWithMultHHAndFaultyTripNoSequences); 
			StaticMethods.computeAverAutoTourDistance(autoTourCollection, avgAutoTourDistance);
			StaticMethods.computeSkippedTours(autoTourCollection, skippedTours, avgAutoTourDuration);
			StaticMethods.computeAvgAutoTourTravelTime(autoTourCollection, avgAutoTourTravelTime);
			StaticMethods.computeAvgAutoTourActivityTime(autoTourCollection, avgAutoTourActivityTime);
		}
	}

	static void trimAutoTourCollectionData(ArrayList<AutoTour> autoTourCollection) {
		for (int i = autoTourCollection.size() - 1; i >= 0; i--)
		{
			if (autoTourCollection.get(i).hasFaultyLTripNoSequence())
			{
				//autoTourCollection.remove(i);
			}
			if (autoTourCollection.get(i).hasMultVehicle())
			{
				autoTourCollection.remove(i);
			}
			if (autoTourCollection.get(i).isIncomplete())
			{
				//autoTourCollection.remove(i);
			}
		}
	}

	static void countAutoTourCollectionAttributes(
			ArrayList<AutoTour> autoTourCollection, int incompleteTours,
			int toursWithMultVehicles, int toursWithMultHH,
			int faultyLTripNoSequences,
			int toursWithMultHHAndFaultyTripNoSequences) {
		System.out.println("\n" + "There are " + autoTourCollection.size() + " auto tours in the autoTourCollection ArrayList");
		for(int i = 0; i < autoTourCollection.size(); i++)
		{
			if(((AutoTour) autoTourCollection.get(i)).isIncomplete() == true)
			{
				incompleteTours++;
			}
			if(((AutoTour) autoTourCollection.get(i)).hasFaultyLTripNoSequence() == true)
			{
				faultyLTripNoSequences++;
			}
			if(((AutoTour) autoTourCollection.get(i)).hasMoreThanOneHH() == true)
			{
				toursWithMultHH++;
			}
			if(((AutoTour) autoTourCollection.get(i)).hasMultVehicle() == true)
			{
				toursWithMultVehicles++;
			}
			if(((AutoTour) autoTourCollection.get(i)).hasMoreThanOneHH() == true && ((AutoTour) autoTourCollection.get(i)).hasFaultyLTripNoSequence() == true)
			{
				toursWithMultHHAndFaultyTripNoSequences++;
			}
		}
		System.out.println("There are " + incompleteTours + " incomplete tours in the autoTourCollection ArrayList"); 
		System.out.println("There are " + toursWithMultVehicles + " tours that use more than one vehicle in the autoTourCollection ArrayList");
		System.out.println("There are " + toursWithMultHH + " tours that have more than one HH in the autoTourCollection ArrayList");
		System.out.println("There are " + faultyLTripNoSequences + " tours with faulty sequences of linked trip numbers"); 
		System.out.println("There are " + toursWithMultHHAndFaultyTripNoSequences + " tours with both multiple hh and faulty sequences of ltripnos");
	}

	static void computeAvgAutoTourActivityTime(
			ArrayList<AutoTour> autoTourCollection,
			double avgAutoTourActivityTime) {
		for(int i = 0; i < autoTourCollection.size(); i++)
		{
			avgAutoTourActivityTime += ((AutoTour) autoTourCollection.get(i)).totalActivityTimeOnTour();
		}
		avgAutoTourActivityTime = (avgAutoTourActivityTime/autoTourCollection.size());
		System.out.println("The average activity time for an auto tour is " + avgAutoTourActivityTime + " minutes.");
	}

	static void computeAvgAutoTourTravelTime(
			ArrayList<AutoTour> autoTourCollection, double avgAutoTourTravelTime) {
		for(int i = 0; i < autoTourCollection.size(); i++)
		{
			avgAutoTourTravelTime += ((AutoTour) autoTourCollection.get(i)).totalTravelingTimeOnTour();
		}
		avgAutoTourTravelTime = (avgAutoTourTravelTime/autoTourCollection.size());
		System.out.println("The average travel time for an auto tour is " + avgAutoTourTravelTime + " minutes.");
	}

	static void computeSkippedTours(
			ArrayList<AutoTour> autoTourCollection, int skippedTours,
			double avgAutoTourDuration) {
		for(int i = 0; i < autoTourCollection.size(); i++)
		{
			avgAutoTourDuration += ((AutoTour) autoTourCollection.get(i)).totalTourTime();
			if (((AutoTour) autoTourCollection.get(i)).getSkipped() != 0)
				skippedTours++;
		}
		System.out.println("There were " + skippedTours + " entries with an invalid trip duration entry.  They were skipped.");
		avgAutoTourDuration = (avgAutoTourDuration/(autoTourCollection.size() - skippedTours));
		System.out.println("The average duration for an auto tour is " + avgAutoTourDuration + " minutes.");
	}

	static void computeAverAutoTourDistance(
			ArrayList<AutoTour> autoTourCollection, double avgAutoTourDistance) {
		for(int i = 0; i < autoTourCollection.size(); i++)
		{
			avgAutoTourDistance += ((AutoTour) autoTourCollection.get(i)).totalTourMiles();
		}
		avgAutoTourDistance = (avgAutoTourDistance/autoTourCollection.size());
		System.out.println("The average distance for an auto tour is " + avgAutoTourDistance + " miles.");
	}

	static void trimVehicleArrayListToUsedAutomobiles(ArrayList<Vehicle> vehicles) {
		for(int i = vehicles.size() - 1; i >= 0; i--)
		{

			if(	   ! (vehicles.get(i).getBODY().equals("1")
					  ||vehicles.get(i).getBODY().equals("2")
					  ||vehicles.get(i).getBODY().equals("3")
					  ||vehicles.get(i).getBODY().equals("4")
					  ||vehicles.get(i).getBODY().equals("5")
					 )
					||vehicles.get(i).getCNTV().equals("2")
					)

			{
				vehicles.remove(i);
			}
		}
	}

	static void computeAverageAutomobileDistanceDriven()
	{
		
	}
	
	static void countNumberOfPotentialElectricVehicles()
	{
		
	}
	
	static void computeAverageAutomobileTimeDriven()
	{
		
	}
	
	static void computeAverageAutomobileTimeParked()
	{
		
	}

	static void computeRemainingRangeOfAutomobiles(ArrayList<Automobile> automobileCollection) {
		int numInvalidAutomobiles = 0;
		int numPotentialElectricAutomobiles = 0;
		int numPotentialElectricAutomobiles0_5RemainingInRange = 0;
		int numPotentialElectricAutomobiles6_9RemainingInRange = 0;
		int numPotentialElectricAutomobiles10_19RemainingInRange = 0;
		int numPotentialElectricAutomobiles20_29RemainingInRange = 0;
		int numPotentialElectricAutomobiles30_39RemainingInRange = 0;
		int numPotentialElectricAutomobiles39_40RemainingInRange = 0;
		int numPotentialElectricAutomobiles41_49RemainingInRange = 0;
		int numPotentialElectricAutomobiles50_59RemainingInRange = 0;
		int numPotentialElectricAutomobiles60_69RemainingInRange = 0;
		int numPotentialElectricAutomobiles70PlusRemainingInRange = 0;
		
	
	
	
		//No charging vehicles during day at all:
		
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
	
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() >= 0 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 5)
			{
				numPotentialElectricAutomobiles0_5RemainingInRange++;
			}
	
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 5 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 9 )
			{
				numPotentialElectricAutomobiles6_9RemainingInRange++;
			}
	
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 9 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 19)
			{
				numPotentialElectricAutomobiles10_19RemainingInRange++;
			}
	
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 19 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 29)
			{
				numPotentialElectricAutomobiles20_29RemainingInRange++;
			}
	
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 29 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 39)
			{
				numPotentialElectricAutomobiles30_39RemainingInRange++;
			}
	
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 39 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 40)
			{
				numPotentialElectricAutomobiles39_40RemainingInRange++;
			}
			
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 40 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 49)
			{
				numPotentialElectricAutomobiles41_49RemainingInRange++;
			}

			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 49
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 59)
			{
				numPotentialElectricAutomobiles50_59RemainingInRange++;
			}
			
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 59 
					&& automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() <= 69)
			{
				numPotentialElectricAutomobiles60_69RemainingInRange++;
			}
			
			if(automobileCollection.get(i).getAutomobileRange() - automobileCollection.get(i).totalMilesDriven() > 69 )
			{
				numPotentialElectricAutomobiles70PlusRemainingInRange++;
			}
			
			
		}
		System.out.println("The number of invalid automobiles is: " + numInvalidAutomobiles + "\n" +
				"The number of potentially electric vehicles is: " + numPotentialElectricAutomobiles + "\n" +
				"The number of potentially electric vehicles with  0-5 miles left in its range is: " + numPotentialElectricAutomobiles0_5RemainingInRange + "\n" +
				"The number of potentially electric vehicles with  6-9 miles left in its range is: " + numPotentialElectricAutomobiles6_9RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 10-19 miles left in its range is: " + numPotentialElectricAutomobiles10_19RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 20-29 miles left in its range is: " + numPotentialElectricAutomobiles20_29RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 30-39 miles left in its range is: " + numPotentialElectricAutomobiles30_39RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 39-40 miles left in its range is: " + numPotentialElectricAutomobiles39_40RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 41-49 miles left in its range is: " + numPotentialElectricAutomobiles41_49RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 50-59 miles left in its range is: " + numPotentialElectricAutomobiles50_59RemainingInRange + "\n" +
				"The number of potentially electric vehicles with 60-69 miles left in its range is: " + numPotentialElectricAutomobiles60_69RemainingInRange + "\n" + 
				"The number of potentially electric vehicles with 70 plus miles left in its range is: " + numPotentialElectricAutomobiles70PlusRemainingInRange + "\n"
				);
	}
	

}

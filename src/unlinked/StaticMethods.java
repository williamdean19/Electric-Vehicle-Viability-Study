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
	
}

package unlinked;

import java.util.ArrayList;

public class Automobile {
	
	public Automobile(ArrayList<AutoTour> automobileAttrib)
	{
		//if the arraylist does not have SAMPN and VEHNO all the same, then it is not a valid list of tours for this automobile
	}
	
	public String toString()
	{
		/*
		 * Information to include:
		 * Starting location, drive time and distance between activities, destination purposes, ending location
		 * Total miles, total time driven, total time parked, total time at home
		 */
		return "";
	}
	
	public boolean meetsElectricVehicleRequirements()
	{
		return true;
	}
	
	public boolean endsDayAtHome()
	{
		return true;
	}
	
	public boolean beginsDayAtHome()
	{
		return true;
	}
	
	public double totalTimeAtHome()
	{
		double timeAtHome = 0;
		
		return timeAtHome;
	}
	
	public double totalTimeParked()
	{
		double timeParked = 0;
		
		return timeParked;
	}
	
	public double totalMilesDriven()
	{
		double milesDriven = 0;
		
		return milesDriven;
	}
	
	public double totalTimeDriven()
	{
		double timeDriven = 0;
		
		return timeDriven;
	}
	

	//public int numTours()
	
	//public double timeBetweenTours()
	

}

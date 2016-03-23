package unlinked;

import java.util.ArrayList;

public class Automobile {

	private ArrayList<AutoTour> automobileTours;
	
	private boolean isValidAutomobile = true;
	private int electricAutomobileRange = 40;


	public void setAutomobileRange(int r)
	{
		electricAutomobileRange = r;
	}
	
	public int getAutomobileRange()
	{
		return electricAutomobileRange;
	}
	
	
	public Automobile(ArrayList<AutoTour> automobileAttrib)
	{
		automobileTours = automobileAttrib;
		
		// The following for loop checks if the auto tours consisiting this vehicle have the same sampn and vehno
		// It is assumed no tour has multiple sampns or vehnos, we only check against the trip of each tour
		for(int i = 0; i < automobileTours.size(); i++)
		{
			
			if(automobileTours.get(0).getTrips().get(0).getSAMPN() != automobileTours.get(i).getTrips().get(0).getSAMPN())
			{
				setValidAutomobile(false);
			}
			
			if(automobileTours.get(0).getTrips().get(0).getVEHNO() != automobileTours.get(i).getTrips().get(0).getSAMPN())
			{
				setValidAutomobile(false);
			}
				
		}

		//if the arraylist does not have SAMPN and VEHNO all the same, then it is not a valid list of tours for this automobile
	}

	public ArrayList<AutoTour> getTours()
	{
		return automobileTours;
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
		if(this.totalMilesDriven() <= electricAutomobileRange)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean endsDayAtHome()
	{
		return automobileTours.get(automobileTours.size()-1).homeIsDestination();
	}

	public boolean beginsDayAtHome()
	{
		return automobileTours.get(0).homeIsOrigin();
	}

	public double totalTimeAtHome()
	{
		double timeAtHome = 0;

		return timeAtHome;
	}

	public double totalTimeParked()
	{
		double timeParked = 0;

		for(int i = 0; i < automobileTours.size(); i++)
		{
			timeParked += automobileTours.get(i).totalActivityTimeOnTour();
		}
		
		return timeParked;
	}

	public double totalMilesDriven()
	{
		double milesDriven = 0;

		for(int i = 0; i < automobileTours.size(); i++)
		{
			milesDriven += automobileTours.get(i).totalTourMiles();
		}
		
		return milesDriven;
	}

	public double totalTimeDriven()
	{
		double timeDriven = 0;

		for(int i = 0; i < automobileTours.size(); i++)
		{
			timeDriven += automobileTours.get(i).totalTravelingTimeOnTour();
		}
		
		return timeDriven;
	}

	public boolean isValidAutomobile() {
		return isValidAutomobile;
	}

	public void setValidAutomobile(boolean isValidAutomobile) {
		this.isValidAutomobile = isValidAutomobile;
	}


	//public int numTours()

	//public double timeBetweenTours()


}

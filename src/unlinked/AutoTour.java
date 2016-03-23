package unlinked;

import java.util.ArrayList;

public class AutoTour {
	
	
	private ArrayList<AutoTripSegment> tourAttributes = new ArrayList<AutoTripSegment>();
	private boolean incomplete = false;
	private boolean faultyLTripNoSequence = false;
	private boolean moreThanOneHH = false;
	private int skipped = 0;
	private boolean multVehicle = false;
	private int numHHs = 0;
	private boolean homeIsOrigin;
	private boolean homeIsDestination;
	private int ltripnoSum = 0;
	
	public boolean homeIsOrigin()
	{
		return homeIsOrigin;
	}
	
	public boolean homeIsDestination()
	{
		return homeIsDestination;
	}
	
	public AutoTour(ArrayList<AutoTripSegment> tourAttrib)
	{
		tourAttributes = tourAttrib;
		
	
		
		if(tourAttributes.size() != 0)
			{
			if(tourAttributes.get(0).getORIG_HOME().equals("1"))
			{
				homeIsOrigin = true;
			}
			else
			{
				homeIsOrigin = false;
			}
			
			if(tourAttributes.get(tourAttributes.size()-1).getDHOME().equals("1"))
			{
				homeIsDestination = true;
			}
			else
			{
				homeIsDestination = false;
			}
		}
		
		//if the arraylist does not have ORIG_HOME as the start of the tour or does not have DHOME as the end of the tour, mark this as an incomplete tour
		if(tourAttributes.size() != 0)
		{
			if (homeIsOrigin == false || homeIsDestination == false)
			{
				incomplete = true;
			}
		}
		
		//if the arraylist passed to this constructor does not have SAMPN all the same then it is not a valid auto tour
		for(int i = 0; i < tourAttributes.size(); i++ )
		{		
			String firstSampn = tourAttributes.get(0).getSAMPN();
			String thisSampn = tourAttributes.get(i).getSAMPN();
			
			if(!firstSampn.equals(thisSampn))
			{
				moreThanOneHH = true;
			}
		}
		//if the arraylist passed to this constructor has anything but LTRIPNO starting at 1, with this trip having ORIG_HOME = 1
		//LTRIPNO must increment by 1, it can keep incrementing indefinitely, but the final trip should have DHOME = 1
		
		for(int i = 0; i < tourAttributes.size(); i++)
		{		
			ltripnoSum += Integer.parseInt((tourAttributes.get(i).getLTRIPNO()));
		}
		if(ltripnoSum !=  ((tourAttributes.size()) * (tourAttributes.size()+1))/2 )
		{
			setFaultyLTripNoSequence(true);
		}
		
		for(int i = 0; i < tourAttributes.size(); i++)
		{		
			if(!(tourAttributes.get(0).getVEHNO().equals(tourAttributes.get(i).getVEHNO())))
			{
				multVehicle = true;
			}
		}
	}
	
	public double totalTourMiles()
	{
		double totalMiles = 0;
		
		for(int i = 0; i < tourAttributes.size(); i++)
		{
			totalMiles += Double.parseDouble(tourAttributes.get(i).getTRIPDIST());
		}
		
		return totalMiles;
	}
	
	public double totalTourTime()
	{
		double totalTime = 0;
		
		totalTime = this.totalActivityTimeOnTour() + this.totalTravelingTimeOnTour();
		
		return totalTime;
	}
	
	public double totalTravelingTimeOnTour()
	{
		double totalTravelingTime = 0;
		
		for(int i = 0; i < tourAttributes.size(); i++)
		{
			if(!tourAttributes.get(i).getTRPDUR().equals(" "))
			{
				totalTravelingTime += Integer.parseInt(tourAttributes.get(i).getTRPDUR());
			}
			else
			{
				skipped++;
			}
		}
		
		return totalTravelingTime;
	}
	
	public double totalActivityTimeOnTour()
	{
		double totalActivityTime = 0;
		
		for(int i = 0; i < tourAttributes.size()-1; i++)
		{
			totalActivityTime += Double.parseDouble(tourAttributes.get(i).getACTDUR());
		}
		
		return totalActivityTime;
	}

	public int getSkipped() {
		return skipped;
	}

	public boolean isIncomplete() {
		return incomplete;
	}

	public boolean hasMultVehicle() {
		return multVehicle;
	}

	public boolean hasFaultyLTripNoSequence() {
		return faultyLTripNoSequence;
	}

	public void setFaultyLTripNoSequence(boolean faultyLTripNoSequence) {
		this.faultyLTripNoSequence = faultyLTripNoSequence;
	}

	public boolean hasMoreThanOneHH() {
		return moreThanOneHH;
	}

	public void setMoreThanOneHH(boolean moreThanOneHH) {
		this.moreThanOneHH = moreThanOneHH;
	}

	public ArrayList<AutoTripSegment> getTrips()
	{
		return tourAttributes;
	}
	
	public String toString()
	{
		String plsamList = tourAttributes.get(0).getPLSAM();
		String sampnList = tourAttributes.get(0).getSAMPN();
		String ltripnoList = tourAttributes.get(0).getLTRIPNO();
		String vehnoList = tourAttributes.get(0).getVEHNO();
		
		for(int i = 1; i < tourAttributes.size(); i++)
		{	
			plsamList = plsamList + ", " + tourAttributes.get(i).getPLSAM();
			sampnList = sampnList + ", " + tourAttributes.get(i).getSAMPN();
			ltripnoList = ltripnoList + ", " + tourAttributes.get(i).getLTRIPNO();
			vehnoList = vehnoList + ", " + tourAttributes.get(i).getVEHNO();
		}
				
		return "The number of trips in this tour is: " + tourAttributes.size() + "\n"
				+ "The list of PLSAMs (unique unlinked trip identifier) is: " + plsamList + "\n"
				+ "The list of SAMPNs is (these should all be the same): " + sampnList + "\n"
				+ "The list of LTRIPNOS in ascending order is: " + ltripnoList + "\n"
				+ "These trips were all completed by the same vehicle: " + multVehicle + "\n"
				+ "The list of VEHNOs for this tour is (should all be the same): " + vehnoList + "\n"
				+ "This trip has a faulty sequence of linked trip numbers: " + this.hasFaultyLTripNoSequence() + "\n"
				+ "This tour has more than one household: " + this.hasMoreThanOneHH() + "\n"
				+ "This tour has it's origin as home: "  + this.homeIsOrigin + "\n"
				+ "No intermediate trip stops at home: " + "\n"
				+ "This tour has its final destination as home: " + this.homeIsDestination + "\n"
				+ "This tour is marked as incomplete: " + this.isIncomplete() + "\n";
	}

	public String getPLSAM() {
		// Returns the value of PLSAM for the first entry of this Tour (for sorting purposes)
		return tourAttributes.get(0).getPLSAM();
	}
}

package unlinked;
import java.util.Comparator;

public class AutoTourComparator implements Comparator<AutoTour> {

	@Override
	public int compare(AutoTour at1, AutoTour at2)
	{
		long sampn1 =  Long.parseLong(at1.getTrips().get(0).getSAMPN());
		long sampn2 =  Long.parseLong(at2.getTrips().get(0).getSAMPN());



		if ( sampn1 < sampn2 )
			return (-1);
		else if ( sampn1 > sampn2 )
			return (1);
		else 
		{
			int vehNo1 = Integer.parseInt(at1.getTrips().get(0).getVEHNO());
			int vehNo2 = Integer.parseInt(at2.getTrips().get(0).getVEHNO());
			
			if ( vehNo1 < vehNo2 )
				return (-1);
			else if ( vehNo1 > vehNo2 )
				return (1);
			else
				return(0);
		}
	}
}



package unlinked;

import java.util.Comparator;

public class AutoTripSegmentComparator implements Comparator<AutoTripSegment> {
	
	@Override
	public int compare(AutoTripSegment s1, AutoTripSegment s2)
	   {
	       long weight1 =  Long.parseLong(s1.getPLSAM());
	       long weight2 =  Long.parseLong(s2.getPLSAM());
	       
	       if ( weight1 < weight2 )
	         return (-1);
	       else if ( weight1 > weight2 )
	         return (1);
	       else 
	         return (0);
	   }
}

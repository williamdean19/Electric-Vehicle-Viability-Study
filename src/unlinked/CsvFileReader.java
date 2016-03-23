package unlinked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFileReader
{
	
	private static final String COMMA_DELIMITER = ",";
	
	public static ArrayList<Vehicle> vehicleCsvFileToArrayList(String fileName)
	{
		ArrayList<Vehicle> vehicleArrList = new ArrayList<Vehicle>();
		
		try
		{
			
			BufferedReader fileReader = null;

			String line = "";
		
			fileReader = new BufferedReader(new FileReader(fileName));
		
			//Skip the CSV file headers
			fileReader.readLine();

			while((line = fileReader.readLine()) != null)
			{
				ArrayList<String> attributes = new ArrayList<String>();
				String[] tokens = line.split(COMMA_DELIMITER);
				for(int i = 0; i < tokens.length; i++)
				{
					attributes.add(tokens[i]);
				}
				
				Vehicle newVehicle = new Vehicle(attributes);
				vehicleArrList.add(newVehicle);
			}
			
			fileReader.close();
			

			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return vehicleArrList;
	}
	
	public static ArrayList<UnlinkedTrip> unlinkedTripCsvFileToArrayList(String fileName)
	{
		
		ArrayList<UnlinkedTrip> unlinkedTripsArrList = new ArrayList<UnlinkedTrip>();
		
		try
		{
			
			BufferedReader fileReader = null;

			String line = "";
		
			fileReader = new BufferedReader(new FileReader(fileName));
		
			//Skip the CSV file headers
			fileReader.readLine();

			while((line = fileReader.readLine()) != null)
			{
				ArrayList<String> attributes = new ArrayList<String>();
				String[] tokens = line.split(COMMA_DELIMITER);
				for(int i = 0; i < tokens.length; i++)
				{
					attributes.add(tokens[i]);
				}
				
				UnlinkedTrip unlinkedTrip = new UnlinkedTrip(attributes);
				unlinkedTripsArrList.add(unlinkedTrip);
			}
			
			fileReader.close();
			

			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return unlinkedTripsArrList;
	}

}

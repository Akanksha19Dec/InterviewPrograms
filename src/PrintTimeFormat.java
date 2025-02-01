
//Test data and output for date formats Input 15012021 Output 15 Jan 2021

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTimeFormat {

	public static void main (String [] args)
	{
		String inputDate= "15012021" ;
		String outputDate = "";
	
		SimpleDateFormat inputFormat = new SimpleDateFormat("ddMMyyyy");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy");
		
		Date date = new Date();
		 try {
			date = inputFormat.parse(inputDate);
			outputDate = outputFormat.format(date);
			
		System.out.println("The output format is "+outputDate);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 
		
	}

	
}

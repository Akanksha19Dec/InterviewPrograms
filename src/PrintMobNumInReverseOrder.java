

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintMobNumInReverseOrder {

	public static String moveZero(String n)
	{
		ArrayList<Long> list = new ArrayList<Long>();
	 
		long num = Long.parseLong(n);
		  while(num >0)
		  {
			  list.add(num%10);
			  num=num/10;
			  
		  }
		Collections.sort(list , Collections.reverseOrder());
		return list.toString();
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number ");
		String n = sc.nextLine();
		
		System.out.println("The mobile number now is " + moveZero(n));

		sc.close();
		
	}
}

//Write a script to count the number of occurrences of the given element in an array.




import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NoOfOccurrenceInArray {

	public static int noOfOccurrence(Integer arr[],Integer num)
	{
		List<Integer> list = Arrays.asList(arr);
		
		return Collections.frequency(list, num);
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		{arr[i] = sc.nextInt();}

		
		System.out.println("Which no you want to know occurrence ");
		Integer num = sc.nextInt();
		sc.close();
		System.out.println("The num appeared "+noOfOccurrence(arr,num)+ " times");
	}
	
	}
	


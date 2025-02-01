

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlusOne {

	public static <T> void addInt(Integer arr[])
	{
		List<Integer> list = new LinkedList<>(Arrays.asList(arr));
		String s ="";
		for(Integer i : list)
			s+=i;
		
		Integer newNum= Integer.parseInt(s)+1;
	
		list.clear();
		 while(newNum>0)
		 {
			 list.add(newNum%10);
			 newNum=newNum/10;
		 }
		
		// Collections.sort(list,Collections.reverseOrder());
		 Collections.reverse(list);
		
		System.out.println("The resultant list of array is "+list);
			
		}
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		
	
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		arr[i]= sc.nextInt();
		sc.close();
		
    addInt(arr);
	
	
	
}
}
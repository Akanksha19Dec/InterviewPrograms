

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndFinalOccrOfNum {

	public static void main(String [] args)
	{
		int left = 0;
		int right =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		{arr[i] = sc.nextInt();}
		
		System.out.println("Which no you want to find first and final occurrence? ");
		int num = sc.nextInt();
		
		Arrays.sort(arr);
	sc.close();
	for(int i =0 ; i< arr.length;i++)
	{
		if(arr[i]==num)
			{left=i;
		break;}
	}
		
	
	for(int j = arr.length-1 ; j>=0 ;j--)
	{
		if(arr[j]==num)
		{  right = j;
       break;}
	}
	
			System.out.println("First occurrence of "+num+ " is " +left+ " and last occurrence is " +right);
	}
}

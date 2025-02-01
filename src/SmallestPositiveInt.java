//Given an array of size N, find the smallest positive integer value that is either not presented in the array or cannot be represented as a sum(coz sum means you are adding two or more elements) of some elements from the array.



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmallestPositiveInt {

	public static int smallestInt(int arr[])
	{ 
		Arrays.sort(arr);
		int res = 1;
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>res)
				return res;
			else
				res+=arr[i];
		}
		return res;
		
	}
	public static void main(String [] args)
	{
		int array[] = {1, 1, 3, 4};// {1, 10, 3, 11, 6, 15}; //{1, 1, 1} ; //;
		
		System.out.println("The smallest number is " +smallestInt(array));
	}	
}

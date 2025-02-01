//Given an array arr[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all numbers from 1 to N. Make in-place changes in arr[], such that arr[i] = frequency(i). Assume 1-based indexing.
//Note: The elements greater than N in the array can be ignored for counting and do modify the array in-place. 


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqOfLimRangEle {

	public static int[] freqCal(int[] arr , int N)
	{
		
	
		int [] freq= new int[N];
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int value : arr)
		{
			map.put(value,map.getOrDefault(value, 0)+1);
			
		}
		for(int i=0;i<N;i++)
		{
			if(map.containsKey(i+1))
				freq[i]=map.get(i+1);
			else
				freq[i]=0;
		}
		
		return freq;
	}
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size ");
	int N = sc.nextInt();
	int arr[] = new int[N];
	

	System.out.println("Enter the array ");
	for(int i=0;i<N;i++)
	arr[i]= sc.nextInt();
	sc.close();

	
	int []freq = freqCal(arr,N);
	
	System.out.println("The product array is");
	for(int i=0;i<freq.length;i++)
		System.out.print(freq[i]+" ");	
	
}}


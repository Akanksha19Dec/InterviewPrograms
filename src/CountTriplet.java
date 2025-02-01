//Given an //array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTriplet {
public static int countTriplet(int [] arr)
	
{
	int count =0;

   Map <Integer,Integer> map = new HashMap<Integer,Integer>();
	
	
    for(int i : arr)
    {
    	map.put(i, map.getOrDefault(i, 0)+1);
    }
    
    for(int i=0 ;i <arr.length;i++) {
    	for(int j=i+1;j<arr.length;j++)
    	{
    		int sum = arr[i]+arr[j];
    		if(map.containsKey(sum))
    			{System.out.println(arr[i]+" "+arr[j]+" "+sum);
    			++count;
    			}}
    }
	return count;
	
}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int N = sc.nextInt();
		int values[] = new int[N];
		
		
		System.out.println("Enter the values ");
		for(int i =0 ; i < N; i++)
		{
			values[i]=sc.nextInt();
		}
	sc.close();

	System.out.println("The triplets are " +countTriplet(values));
	
	
	}
	
	
	
	
	
	
}

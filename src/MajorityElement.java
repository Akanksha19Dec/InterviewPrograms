

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

	public static int findMajority(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int N = arr.length;
		
		for(int a :arr)
			map.put(a, map.getOrDefault(a, 0)+1);
		
		for(int key : map.keySet())
		{
			if(map.get(key)>N/2)
				return key;
		}
		return -1;
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
	
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		arr[i]= sc.nextInt();
		sc.close();
		
		System.out.println("The majority element is "+findMajority(arr));
	}
	
}

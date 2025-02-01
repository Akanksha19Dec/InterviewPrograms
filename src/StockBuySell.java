

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockBuySell {

	public static   ArrayList<ArrayList<Integer>> stockBuy (int []arr)
	{
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		int diff=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					diff=arr[j]-arr[i];
					map.put(i+" "+j, diff);
					list.add(i);
					list.add(j);
				    res.add(list);
				    //list.remove(0);
				}
			}
		}
		
		return res;
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		

		System.out.println("Enter the array ");
		for(int i=0;i<N;i++)
		arr[i]= sc.nextInt();
		sc.close();
		
		ArrayList<ArrayList<Integer>> aList=stockBuy(arr);
		
		if(aList.size()>0)
		{
			  for (int i = 0; i < aList.size(); i++) { 
		            for (int j = 0; j < aList.get(i).size(); j++) { 
		                System.out.print(aList.get(i).get(j) + " "); 
		            } 
		            System.out.println(); 
			}}
		else {
			System.out.println("No Profit");
		}
		
	}
}



import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlternativePosNegNos {

	public static void printAlternate(Integer []arr)
	{
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list3 = new LinkedList<Integer>();
		int k = 0,pos=0;
		
		for(Integer i : arr)
		{
			if(i>=0)
			list1.add(i);    
			else
			list2.add(i);
		}
	
		int size = 2*Math.min(list1.size(), list2.size());
		
		while(k<size)
		{
			if(!(list1.isEmpty()||list2.isEmpty()))
			{if(k%2==0)
				{list3.add(list1.get(pos)); list1.remove(pos);}
			else
			{list3.add(list2.get(pos)); list2.remove(pos);}
		k++;	
		}}
		
	//list3= ((!list1.isEmpty())? (list3.addAll(list1)):((!list2.isEmpty())? (list3.addAll(list2)): list3)));
	
	if(!list1.isEmpty())
		list3.addAll(list1);
	else if(!list2.isEmpty())
		list3.addAll(list2);
	
	System.out.println("The resultent list is "+list3);
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
		
		printAlternate(arr);
		
}
}
	


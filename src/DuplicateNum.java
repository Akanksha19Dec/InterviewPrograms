
//Find duplicate numbers from a given array.




import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNum {

	public static void findDupNum(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int value : arr)
		{
			map.put(value, map.getOrDefault(value, 0)+1);
		}
		System.out.println("The duplicate nums in array are ");
		
		for(int key : map.keySet())
		{
			if(map.get(key)>1)
				System.out.print(key +" ");
		}
	}
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		{arr[i] = sc.nextInt();}
		
		findDupNum(arr);
		
	}
	
}

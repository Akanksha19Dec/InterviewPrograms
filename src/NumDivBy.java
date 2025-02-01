//Write a function that will print tell the user if a number is divisible by 8, 16, or 32.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumDivBy{

	public static void numDivBy(String num)
	{  
		int n = Integer.parseInt(num);
	  int count = 0;
	  
	  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	  map.put(8,n%8);
	  map.put(16,n%16);
	  map.put(32,n%32);
	
	  
	for(int key :map.keySet())
	{
		if(map.get(key) == 0)
			System.out.print(key +" ");
		else
			count=count+1;
	}
	  if(count==map.size())
	  {
		  System.out.println("The number is not divisible by any of it");
	  }
	}
	
	public static void main(String[] args)
	{
		try {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number ");
		 String num = bf.readLine();
		 numDivBy(num);
		 }catch(IOException e)
		{
		System.err.println("IOException " +e.getMessage());
		}
	
	
}
}
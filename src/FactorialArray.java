

import java.util.Scanner;

public class FactorialArray {

	public static long[] fact(long []arr)
	{
		long []fact = new long[arr.length];
		
		int i=0;
		for(long value : arr)
		{
			fact[i]=factorial(value);
			i++;
		}
		return fact;
	}
	
	public static long factorial(long value)
	{
	if(value==0)
		return 1;
	
	return value * factorial(value-1);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int N = sc.nextInt();
		long arr[] = new long[N];
		

		System.out.println("Enter the array ");
		for(int i=0;i<N;i++)
		arr[i]= sc.nextInt();
		sc.close();

		
		long []fact = fact(arr);
		
		System.out.println("The product array is");
		for(int i=0;i<fact.length;i++)
			System.out.print(fact[i]+" ");
	}
}


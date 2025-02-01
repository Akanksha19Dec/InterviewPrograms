//Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9.


import java.util.Scanner;

public class NthNaturalNumber {

	public static int findNth(int n)
	{  int noOf9s =0;
	int arr[] = new int[n];	
	
	for(int i=0;i<n;i++)
	 arr[i]=i+1;
	
	if(n<9)
	return n ;
		
	else {{ for(int value :arr)
				{   if(hasNine(value))
						++noOf9s;
				}}
				return n+noOf9s;
	}
	}
	public static boolean hasNine(int num)
	{
		while(num>0)
		{
			if(num%10==9)
				return true;
			num=num/10;
		}
	return false;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural number ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("The "+n+"th natural number after removing 9 is " +findNth(n));
	}
	
}

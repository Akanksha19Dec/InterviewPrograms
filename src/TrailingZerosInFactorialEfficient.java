//A simple method is to first calculate factorial of n, then count trailing 0s in the result but this can cause overflow for bigger numbers. The idea is to consider prime factors of a factorial n. A trailing zero is always produced by prime factors 2 and 5. If we can count the number of 5s and 2s, our task is done.



import java.util.Scanner;

public class TrailingZerosInFactorialEfficient {

	static int findCount(int n)
	{
		int count = 0 ;
		
		for(int i=5;n/i>=1;i*=5)
		{
			count+=n/i;
		}
	
	return count;
	}
	
	public static void main(String [] args)
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number ");
		  int n = sc.nextInt();
		System.out.println("The no of zeros in " +n+ "! are "+findCount(n));
	 	 sc.close();
	}
	
	
}

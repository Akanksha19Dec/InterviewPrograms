//Given an array of N random two-digit numbers, multiply each number with M and print the last 2 digits of each product. 



import java.util.Scanner;

public class PrintLastTwoDigits {

	public static void printlast(int n)
	{  
		int counter =0;
		StringBuilder s = new StringBuilder();
		while(counter<2)
		{
			s.append(String.valueOf(n%10));
			n=n/10;
			
			counter++;
		}
		
	System.out.print(s.reverse().toString());
	}
	
	public static void main(String [] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int N = sc.nextInt();
		int values[] = new int[N];
		int mul=1;;
		
		System.out.println("Enter the values ");
		for(int i =0 ; i < N; i++)
		{
			values[i]=sc.nextInt();
		}
		System.out.println("Enter the value to be multiplied with ");
		int M = sc.nextInt();
		
		System.out.print("The last two digits after multiply ");
		for(int i =0 ; i < N; i++)
		{   
			mul=values[i]*M;
			
			printlast(mul);
		    
			System.out.print(" ");
		}
	
	}
}

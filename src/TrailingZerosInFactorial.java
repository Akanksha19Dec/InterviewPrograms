
//Given an integer n, write a function that returns count of trailing zeroes in n!. 


import java.util.Scanner;

public class TrailingZerosInFactorial {

	
	static int findTrailingZeros(int n)
	{
		
		int fact = fact(n);
		int count=0;
	
		char temp1[] = String.valueOf(fact).toCharArray();
		for(int i=temp1.length-1 ; i>=0;i--)
		{
			if(temp1[i]=='0')
				++count;
			else
				break;
		}
	return count;
	}
  static int fact(int n)
{ 
	if(n==1||n==0)
			return n;
		return n*fact(n-1);
	}


  public static void main(String [] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number ");
	  int n = sc.nextInt();
	  System.out.println("The no of zeros in " +n+ "! are "+findTrailingZeros(n));
	  sc.close();
  }


}

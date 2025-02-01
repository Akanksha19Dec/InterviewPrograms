

public class SumofDigitsInSingleDigit {

	public static int sum(int n)
	{
		int sum =0;
		while(n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum = sum +n%10;
			n=n/10;
		}
	
	return sum;
	}
public static void main(String[] args)
{
	System.out.println("The sum of the digits is " +sum(199));
}
}

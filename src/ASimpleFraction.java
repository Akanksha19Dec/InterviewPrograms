//Given a fraction. Convert it into a decimal. 
//If the fractional part is repeating, enclose the repeating part in parentheses.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ASimpleFraction {

	public static void findFraction(float n , float  d)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		float noReccursive = n / d;
	       int num = Math.round(n);
	       int den = Math.round(d);
	       
		int integerPart = num / den ;
		String res="" ;
		
		
		int rem = num % den;
		
		while(rem!=0 && (!map.containsKey(rem)))
		{
			map.put(rem, res.length());
			rem=rem*10;
			res+=String.valueOf(rem/den);
			rem=rem%den;
		}
		
	if(rem==0)
		System.out.println(String.valueOf(noReccursive));
	else if(map.containsKey(rem))
		System.out.println(String.valueOf(integerPart)+".("+res+")");
	
	}
	
	
	
	public static void main(String []args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numerator = ");
		float n = sc.nextFloat();
		
		System.out.println("Enter denominator = ");
		float d = sc.nextFloat();
		
		sc.close();
   	findFraction(n,d);
	}
	
	
}

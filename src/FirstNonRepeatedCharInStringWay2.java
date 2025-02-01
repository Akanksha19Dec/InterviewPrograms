//Write a program to print the first(alphabetically) non-repeated char in a string. e.g. A string “Is it your first company” returns ‘a’.



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FirstNonRepeatedCharInStringWay2 {

	public static Character nonRep(String s)
	{
		Character value =' ';
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
	    Arrays.sort(s.toCharArray());
		for(char ch : s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
	for(char ch : map.keySet())
	{
		if(map.get(ch)==1)
			{value = ch;
	         break;}
	}

	return value;}

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string ");
	String s = sc.nextLine();
	sc.close();
	System.out.println("The first non repeated character is " +nonRep(s.toLowerCase()));
}
}

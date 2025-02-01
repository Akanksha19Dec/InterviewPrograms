

//Write a program to print the first non-repeated char in a string. e.g. A string “Is it your first company” returns ‘u’.

import java.util.Scanner;
public class FirstNonRepeatedCharInStringWay1 {

	static int index=-1;
	
	public static Character nonRepeat(String s)
	{ 
	 Character ch=' ';
	
	for(char value : s.toCharArray())
	{
		if(s.indexOf(value)==s.lastIndexOf(value))
		{
			ch = value;
			break;
		}
		else
		{
			index=index+1;
			
		}
	
	} 
	ch = (index == s.length()-1)? null : ch;
		return ch;
		}
	
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string ");
	String s = sc.nextLine();
	sc.close();
	System.out.println("The first non repeated character is " +nonRepeat(s.toLowerCase()));
}

}
	


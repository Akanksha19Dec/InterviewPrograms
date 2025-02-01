//Write a script to print the number of occurrences of a given character on all letters in a string.



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrenceInAllLetters {

	public static int countOccurrence(String a , char[] ch)
	{
		int count = 0 ;
		int j=0;
		Map<Character,Integer>map = new HashMap<Character,Integer>();
		
		while(j<a.length())
		{
			map.put(a.charAt(j), map.getOrDefault(a.charAt(j), 0)+1);
			j++; 
		}
		 for(char key : map.keySet())
		 {
			 if(key==ch[0])
			 count = map.get(key);
		 }
		
		return count ;
	}
	public static void main(String [] args)
	{
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter the character to find ");
		String ch = sc.nextLine();
		sc.close();
		System.out.println("The character appeared "+countOccurrence(s,ch.toCharArray())+ " times");
	}
}

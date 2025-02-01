//Calculate the frequency of characters in a string. Print each char with its frequency. e.g. For input <abcabc>, output should be <(a,2),(b,2),(c,2)>.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrintFrequencyOfCharInString {

	public static void printFreq(String s)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int j=0;
		
		while(j<s.length())
		{
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
			j++;
		}
   for(Map.Entry<Character, Integer> entry : map.entrySet())
   {
		System.out.print("(" +entry.getKey()+","+entry.getValue()+")");
	}
	}
public static void main(String [] args)
{
	try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the string ");
	
	String s = br.readLine();
    
    System.out.println("The pattern is  ");
    printFreq(s);
		
	} catch (IOException e) {
		
		e.printStackTrace();}
}}


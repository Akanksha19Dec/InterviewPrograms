

import java.util.HashMap;
import java.util.Map;

public class PrintNonRepeatedCharacter2way {

	public static String nonrepeatedCharacter(char[] s,int n)
	{
	Map<Character,Integer> hs = new HashMap<Character,Integer>();
	StringBuilder sb = new StringBuilder();
	
	for(int i =0 ; i < n ; i++)
	{
		if(!hs.containsKey(s[i]))
		{
			sb.append(s[i]);
			hs.put(s[i], 1);
		}
	}
	
	return sb.toString();
		
	}
	
	
	public static void main (String[] args)
	{
		String s = "greekofgreeks" ;
		
		System.out.println(nonrepeatedCharacter(s.toCharArray(),s.length()));
		
		
	}
}


//Remove all the duplicate characters present in the given string.


import java.util.*;

public class RemoveDuplicates {

	public static String removeDups(String s)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(char ch : s.toCharArray())
		{
			if(!map.containsKey(ch))
			{
				sb.append(ch);
				map.put(ch, map.getOrDefault(ch,0)+1);
			}
		}
	return sb.toString();	
	}
	public static void main(String [] args)
	{
		String s = "ssssrrrrrriiilllank" ;
		System.out.println("Removing duplicate character "+removeDups(s));
	}
	
}

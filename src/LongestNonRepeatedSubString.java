

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedSubString {

public static String longestSubString(String str)
{
	int i=0;
	int j=0;
	String longestStr = "";
	int max=0;
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	while(j<str.length())
	{
		map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)+1);
		
		if(map.size()==j-i+1)
		{
			max = Math.max(max, j-i+1);
			longestStr = longestbtwTwo(longestStr,map.keySet().toString())  ; 
	         j++;
		}
		else if(map.size()<j-i+1)
		{
			while(map.size()<j-i+1)
			{
				map.put(str.charAt(i), map.get(str.charAt(i))-1);
				if(map.get(str.charAt(i))==0)
				{map.remove(str.charAt(i));
				}	i++;
				}
				j++;
			}
		}
	
	return longestStr.replaceAll(",", "");
	}
	
public static String longestbtwTwo(String s1 , String s2)
{
	String s="";
	if(s1 != null && s2!=null)
	{
		s= (s1.length()>s2.length()?s1:s2);
		return s;
	}return null;
}


public static void main(String [] args)
{
	String s = "aabcdbbe";
	System.out.println("The longest non repeated substring " +longestSubString(s));
}
}

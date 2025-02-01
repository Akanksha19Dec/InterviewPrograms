//Find the longest non repeated substring in the string



import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestNonRepeatedCharacters {

	//sliding window questions :
	//Conditions :
	//1.Talks about String and want to find out substring
	//2.Doesn't know or know the length of the string .
		
	
	public static int lengthofLongNonRepChar(String s)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int max = 0;
		int i=0;
		int j=0;
	
		
		while(j<s.length())
		{
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
			
			if(map.size()== j-i+1)
			{
				
				max = Math.max(max,j-i+1);
				j++;
			}
			else if(map.size()<j-i+1)
			{
				while(map.size()<j-i+1)
				{
					map.put(s.charAt(i),map.get(s.charAt(i))-1);
					if(map.get(s.charAt(i))== 0)
                   {map.remove(s.charAt(i));}
				i++;
				}
				j++;
				
				
			}
		}
		return max;
		
	}
	
	
	public static void main(String [] args)
	{
		String str = "cbcdbbc" ;
		System.out.println("The length of the longest non repeated character is  " +lengthofLongNonRepChar(str));
	}
}



import java.util.HashMap;
import java.util.Map;

//Given two strings, S1 and S2, the task is to find the length of the Longest Common Subsequence, i.e. longest subsequence present in both of the strings. 
public class LongestCommonSubsequenceWay1 {

	public static int findSeq(String s1 , String s2)
	{
		int n=0;
		int m = s1.length()-1;
		int l= s2.length()-1;
		
		
		if(m==0||l==0)
			return 0;
		
		Map<Character,Integer> map1 = new HashMap<Character,Integer>();
		Map<Character,Integer> map2 = new HashMap<Character,Integer>();
		
		for(char c : s1.toCharArray())
			map1.put(c,map1.getOrDefault(c, 0)+1);
		
		for(char a : s2.toCharArray())
			map2.put(a,map2.getOrDefault(a, 0)+1);
		
		
		for(char key : map1.keySet())
		{
			if(map2.containsKey(key))
				++n;
			System.out.print(key);
		}
		return n;
	}
	
	
	
	public static void main (String [] args)
	{
		String s1 = "AGGTAB" ;
		String s2 = "GXTXAYB" ;
		System.out.println("The longest common subsequence is " +findSeq(s1,s2));
	}
	
}

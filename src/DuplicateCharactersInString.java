//Write code to count the duplicate characters in a given string.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static int countDups(String s)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		int j=0;
		int count = 0;
		while(j<s.length())
		{
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
			j++;
		}
	for(char ch : map.keySet())
	{
		if(map.get(ch)>1)
			count=count+1;
	}
	return count ;
	}
public static void main(String [] args)
{
	try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the string ");
	
	String s = br.readLine();
    
    System.out.println("The no. of duplicate characters are "+countDups(s));
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}

}

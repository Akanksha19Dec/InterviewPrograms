

import java.util.*;

public class MaxNoOfTimes                    
                                    
{
    static void noOfTimes(String s)
    {
        Map <Character,Integer> map = new HashMap<Character,Integer>();
    
        int res = 0;
        char maxCh =0;
        
        for(char value : s.toCharArray())
        {
            map.put(value,map.getOrDefault(value,0)+1);
            
        if(map.get(value)> res)
    {
        maxCh = value;
        res = map.get(value);
    }   }
    
     System.out.println("The character " +maxCh+ " occurred " + res+ " times");
    }
public static void main(String [] args)
    {
        String a = "Interview Invite";
        
         noOfTimes(a.toLowerCase());
         
    }
}

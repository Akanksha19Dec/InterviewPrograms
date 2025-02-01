

import java.util.Arrays;
import java.util.HashMap;

public class CalculateSequence {
   
   public static int findSeq(int arr[])
   {
       int n = arr.length-1;
    
       boolean flag=false;   // 
       int i =0; //length of each sequence
       
       int l = Integer.MAX_VALUE;
       int r = 0;
       int value =0;
       int left =0;
       int right =0;
      Arrays.sort(arr);   // [1,2,3,4,5,30,50,100,101,102]   
      
      HashMap<Integer,String> map = new HashMap<Integer,String>();
      
          for(int j=0;j<n;j++)
          {  
            
          {if(arr[j+1]==arr[j]+1)
             { flag = true;
             l = Math.min(l, j);
             r= j+1;Math.max(r, j+1);
              continue;}
     
     if(flag == true)
     { map.put(i,l+"-"+r);     
             i++;                                         
             flag = false;
             l = Integer.MAX_VALUE;
             r = 0;
     }}}  
      
      
     for(int key : map.keySet())
     {
    	 String s = map.get(key);
    	 String temp[] = s.split("-");
    	  n = Integer.parseInt(temp[1])-Integer.parseInt(temp[0]);
    	 if(n>value)
    	 {value=n; 
    	left = Integer.parseInt(temp[0]);
    	right = Integer.parseInt(temp[1]); }
     }
     
       System.out.println("The largest sequence is of length " + value);
       System.out.println(arr.toString().substring(left, right));
       
  // }
   return map.size();
   }
    public static void main(String args[]) {
   
    int arr[] = {100, 4, 3, 5, 1, 2, 30, 50, 102, 101};
    
    System.out.println("The no of sequence are " +findSeq(arr));
    
    }
}

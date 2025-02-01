


public class ReverseStringRecursive {
    
    public static String reverse(String a)
    {
        String [] temp = a.split(" ");
        StringBuilder sb = new StringBuilder();
    
        for(String value : temp)   // value = Akanksha
        {
             int left = 0;
            int right = value.length() -1 ;
            char[] values = value.toCharArray();
          
          recursive(left,right,values);
             
        sb.append(String.valueOf(values));
        sb.append(" ");
        }
     return sb.toString() ;
     
    }
    
    static void recursive(int left , int right , char[] values)
    {
    	  while(left<right) {
          char ch = 0;
         
        ch = values[left];
        values[left] =  values[right];
        values[right] = ch;
   
        left++;
        right--;
   
        recursive(left,right,values);}}

	public static void main(String [] args)
    {
        String s = "Akanksha Tallapalli" ;
        
         //ahsknakA illapallaT
        
        System.out.println("The reverse String is  " +reverse(s));
    }
}
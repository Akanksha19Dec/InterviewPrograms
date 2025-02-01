

public class NoOfAlpahbets {

	public static void main(String [] args) {
	String s = "a2b3c8";

			String temp[] = s.split("");
			int n =0;
			 // temp[] = {"a" ,"2" ,"b" , "3" ,"c" ,"8"}
			 
			 StringBuilder sb = new StringBuilder();
			 
			 for(int i =0 ; i<s.length() ; i=i+2)
			 {
			            
				  n = Integer.parseInt(temp[i+1]);
				  for (int j = 1 ; j <= n ; j++)
				  {
				   sb.append(temp[i]);
				   }
				   
				 
			}

			System.out.println("The String is "  +sb.toString());

}}

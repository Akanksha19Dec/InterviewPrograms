
import java.util.*;
public class SumOfTwoNum {

	   
	   public static int sumOfTwoNum(int value1, int value2)
	   {
	       return value1+value2;
	   }
	    public static void main (String [] args)
	    {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the numbers to add");
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    System.out.println("The sum of the numbers is " +sumOfTwoNum(x,y));
	   sc.close();
	    
	    }
}

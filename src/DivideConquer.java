

public class DivideConquer {

	
	static int power(int x, int y)
	{
	    int temp;
	    if (y == 0)
	        return 1;
	    temp = power(x, y / 2);
	    if (y % 2 == 0)
	        return temp * temp;
	    else
	        return x * temp * temp;
	}
	 public static void main(String[] args)
	    {
	        int x = 2;
	        int y = 3;
	 
	        // Function call
	        System.out.println(power(x, y));
	    }
}

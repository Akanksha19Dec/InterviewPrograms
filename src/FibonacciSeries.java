

public class FibonacciSeries {
	static  int []term = new int [1000]; 
	
	static int fib(int n)
	{
	    // base case
	    if (n <= 1)
	        return n;
	
	    if (term[n] != 0)
	        return term[n];
	 
	    else
	    {
	        term[n] = fib(n - 1) + 
	                  fib(n - 2);
	 
	        return term[n];
	    }
	}
	 
	// Driver Code
	public static void main (String[] args) 
	{
	    int n = 6;
	    System.out.println(fib(n));
	}
	
}



public class SquareRoot {

	public static int squareRoot(int x)
	{
		int result = 1;
		int i=1;
		
		if(x==0||x==1)
		return x;
		while(result<=x)
		{
			i++;
			result=i*i;
			 
		}
	return i-1;
	}
	
	public static void main(String [] args)
	{
		System.out.println(squareRoot(3));
	}
	
	
	
}

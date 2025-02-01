

public class TraverseBacktoFront {
	
	public static void main(String[] args)
	{
	int values[] = new int[] {10,8,9,0};
	
	System.out.print("Printing array from start index :");
	
	for(int i =0;i<values.length;i++)
	{
		System.out.print(values[i]+" ");
	}
	System.out.println("Printing array from end index :");
	
	for(int j=values.length-1;j>=0;j--)
	{
		System.out.print(values[j]+" ");
	}
	}

}

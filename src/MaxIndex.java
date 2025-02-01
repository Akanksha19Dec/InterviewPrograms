

import java.util.Scanner;

public class MaxIndex {

	
	public static int maxIndex(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		int max=0;
		
		while(j>=i)
		{
			if(arr[j]>=arr[i])
			   max=Math.max(max, j-i);
			i++;
			j--;
		}
	return max;}
	
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	

	System.out.println("Enter the array ");
	for(int i=0;i<n;i++)
	arr[i]= sc.nextInt();
	sc.close();
	
	System.out.println("The max value is "+maxIndex(arr));
}

}

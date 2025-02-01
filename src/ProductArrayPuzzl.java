

import java.util.Scanner;

public class ProductArrayPuzzl {

	public static int[] productarr(int[] arr)
	{
		int [] prod= new int[arr.length];
		int temp=1,i=0;
		for(int value1 : arr)
		{
			for(int value2 : arr)
			{
				if(value2!=value1)
					temp*=value2;
			}
		prod[i]=temp;
		temp=1;
		i=i+1;
		}
		return prod;}
	
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

	int []prod = productarr(arr);
	
	System.out.println("The product array is");
	for(int i=0;i<prod.length;i++)
		System.out.print(prod[i]+" ");
}
}

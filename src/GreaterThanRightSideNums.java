//Program to count the number of elements which are greater than any of the elements on the right side of an array and if it does s lesser it should be replaced by -1



import java.util.Scanner;

public class GreaterThanRightSideNums {

	public static int findNumCount(int arr[])
	{
	int count =0;
	boolean greater;
	for(int i=0 ; i<arr.length;i++)
	{
		greater=false;
		for(int j=i+1 ; j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{greater=true;break;}
		//	else {arr[j] = -1; }6
		}
	if(greater)
	++count;
		}
	return count ;
	}
	
	public static void main(String [] args)
	{
    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		{arr[i] = sc.nextInt();}
		
		System.out.println("The no of elements that are greater than any of the element in the right side are " +findNumCount(arr));
	
		System.out.println("The array is ");
		
		for(int i=0 ; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
	
}

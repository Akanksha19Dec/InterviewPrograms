//Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 



import java.util.Scanner;

public class RotateArray {

	public static int[] rotate(int arr[],int D)
	{
		int temp=0;
		int n = arr.length-1;
		
	while(D!=0)
	{
	temp=arr[0];
	for(int i=0;i<n;i++)
	arr[i]=arr[i+1];
	arr[n]=temp;
	D--;
	}
		return arr;
		
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
	
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		arr[i]= sc.nextInt();
		
		System.out.println("Enter the steps ");
		int D = sc.nextInt();
		rotate(arr,D);
		
		for(int a : arr)
		System.out.print(a + " ");
		
        sc.close();
}
}

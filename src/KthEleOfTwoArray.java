//Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the kth position of the final sorted array.


import java.util.Arrays;
import java.util.Scanner;

public class KthEleOfTwoArray {

	public static int ktheleTwoArr(int[] arr1,int[] arr2,int k)
	{
	
		int size = arr1.length+arr2.length;
		int i=0;
		int j=0;
		
		int[] arr3= new int[size];
		
		while(i<arr1.length)
			{arr3[i]=arr1[i]; i++;}
		
		while(j<arr2.length)
			{arr3[i]=arr2[j]; j++;i++;}
		
		Arrays.sort(arr3);	
	return arr3[k+1];	
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the array size ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		
		System.out.println("Enter the array1 ");
	    for(int i=0;i<n;i++)
	    arr1[i]= sc.nextInt();
	
	System.out.println("Enter the array2 size ");
	int m = sc.nextInt();
	int arr2[] = new int[m];
	

	System.out.println("Enter the array2 ");
	for(int i=0;i<m;i++)
	arr2[i]= sc.nextInt();
	
	System.out.println("Enter which kth ele to find");
	int k=sc.nextInt();
	sc.close();

	System.out.println("The kth value is "+ktheleTwoArr(arr1,arr2,k));
	
}}



import java.util.Scanner;

public class MaximizeNumberofOne {

	
	public static int maxOnes(int[] arr, int m)
	{
	    // m is the maximum number of zeroes allowed to flip
	  
	       int i=0;
	       int j=0;
	       int max=0; // max is length of the maximum consecutive 1s
	       int zerocount=0;
	       
	       while(j<arr.length)
	       {
	    	   if(arr[j]==0)
	    		   zerocount++;
	    	   
	    	   while(zerocount>m)
	    	   {if(arr[i]==0)
	    		   zerocount--;
	    	   i++;
	    		  
	    	   }
	    	   max=Math.max(max, j-i+1);
	       j++;
	       }

	return max;}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		

		System.out.println("Enter the array ");
		for(int i=0;i<N;i++)
		arr[i]= sc.nextInt();
		

		System.out.println("Enter p value ");
		int m = sc.nextInt();
		sc.close();
	System.out.println("Maximum no of consecutive 1s  "+maxOnes(arr,m));
	
	}
}



import java.util.Scanner;

public class MissingNumber {

	static int missingNumber(int array[], int n) {
	       int sumofArray=0;
	       int sumofN = n*(n+1)/2;
	        
	        for(int i=0;i<array.length;i++)
	        sumofArray+=array[i];
	        
	         //for(int i=1;i<=n;i++)
	        //sumofN+=i;
	        int missingN = sumofN-sumofArray;
	  
	return missingN; }
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	
	int array[] = new int[n-1];
	System.out.println("Enter the array");
	
	for(int i=0;i<n-1;i++)
	array[i]=sc.nextInt();
	
	sc.close();
	
	System.out.println("The missing no is "+missingNumber(array,n));
	
	
	
}

}

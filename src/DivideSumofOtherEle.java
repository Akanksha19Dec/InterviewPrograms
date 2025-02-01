//Pogram to count array elements that divide the sum of all other elements



import java.util.Arrays;
import java.util.Scanner;

public class DivideSumofOtherEle {

	public static int countNum(int arr[])
	{
		int count = 0 ;
		int sum = Arrays.stream(arr).sum();
		
		 for (int i = 0 ; i < arr.length; i++)
		 {
			 if(arr[i]!=0)
			 { if((sum-arr[i])%arr[i]==0)
				 ++count;}
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
	sc.close();
	System.out.println("The count of num that are divisible by the sum of other nums in an array is " +countNum(arr));
}

}

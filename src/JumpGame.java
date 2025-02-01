

import java.util.Arrays;
import java.util.Scanner;

public class JumpGame {

	public static int jumpGame(int[] arr)
	{
 int i=0;
 
 while(i<arr.length)
 {
	 if(arr[i]==0)
		 return 0;
	 else
		 i+=arr[i];
 }
		return 1;
	}
	
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size ");
	int N = sc.nextInt();
	int arr[] = new int[N];
	

	System.out.println("Enter the array ");
	for(int i=0;i<N;i++)
	arr[i]= sc.nextInt();
	sc.close();


System.out.println("Can I make it to the end ? "+jumpGame(arr));

}
}

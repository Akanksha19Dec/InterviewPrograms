//How to reverse an array in the subset of N? e.g. Input: [1,3,5,7,9,11,15,17,19], Output: [5,3,1,11,9,7,19,17,15].



import java.util.Scanner;

public class ReverseArrayInSubSetOfN {

	public static void reverseArray(int arr[], int N)
	{
		for(int i =0 ; i<arr.length; i=i+N)
		{
			int left = i;
			int right = Math.min(i+N-1, arr.length-1);
			
			while(left<right)
			{
				int temp = arr[right];
				arr[right]=arr[left] ;
				arr[left] = temp;
				left++;
				right--;
				
			}
		}
	}
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size ");
	int u = sc.nextInt();
	int arr[] = new int[u];
	
	System.out.println("Enter the array ");
	for(int i=0;i<u;i++)
	{arr[i] = sc.nextInt();}
   
    System.out.println("Enter the subset of N to reverse ");
	int N = sc.nextInt();
	
	 sc.close();
    reverseArray(arr,N);
    
    System.out.println("The resultent array is ");
    for(int i =0; i < arr.length ; i++)
    {
    	System.out.print(arr[i]+" ");
    }
}

}

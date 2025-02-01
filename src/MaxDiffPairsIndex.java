
//Maximum value of difference of a pair of elements and their Index



import java.util.Scanner;

public class MaxDiffPairsIndex {

	public static int findMaxDiff(int[] arr)
	{
		int N = arr.length;
		
		int j=N-1;
		int max=0;
		int temp=0;
		
		for(int i=0;i<N-1;i++)
		{
			while(i<j)
			{
				temp = Math.abs(arr[i]-arr[j])+Math.abs(i-j);
				max=Math.max(max, temp);
				j--;
			}
		j=N-1;
		}
		
		return max;
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
	
		System.out.println("The max diff is "+findMaxDiff(arr));
	}
}

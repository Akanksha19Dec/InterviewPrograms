

import java.util.Arrays;
import java.util.Scanner;

public class LonConsSubseq {

	public static void longConsSubseq(int []arr)
	{
		int i=0;
		int j=0;
		int max=0;
		int n=arr.length-1;
		int temp=0;
		
		Arrays.sort(arr);
		while(j<n)
		{
			temp=arr[j];
			j++;
			if(temp+1!=arr[j])
			i=j;
			else {
			max=Math.max(max, j-i+1);
			}
		}
		//System.out.println("Longest subsequence "+arr.toString().substring(i, j+1));
		System.out.println("Length "+max);
		
		
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		

		System.out.println("Enter the array ");
		for(int i=0;i<N;i++)
		arr[i]= sc.nextInt();
		sc.close();
	
		longConsSubseq(arr);
	
}}

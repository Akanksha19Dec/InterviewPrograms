//Given a number in an array form. Write a program to move all zeros to the end.



public class MoveZerosToEndWay2 {

	public static void main(String [] args)
	{
		int arr[] = {1 ,9, 0 , 6 , 8 , 0 , 4};
		int j = 0 ;
		int temp ;
		
		for(int i = 0 ; i < arr.length ; i ++)
		{
			if(arr[i] != 0)
			{  temp = arr[j];
			arr[j] = arr[i];
			 arr[i] = temp;
			 j++;
			}
		}
	System.out.println("The array is ");
	for(int i = 0 ; i <arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	}
}

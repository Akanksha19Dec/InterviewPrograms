//Given a number in an array form. Write a program to move all zeros to the end.



public class MoveZeroToEndWay1 {

	public static void moveZero(int arr[])
	{
	int count = 0 ;
	
	for(int i = 0 ; i <arr.length; i++)
	{
		if(arr[i]!=0)
		{
			arr[count++]=arr[i];
		}}
	while(count < arr.length)
	{
		arr[count++]= 0;
	}
	}
	
public static void main(String[] args)
{
	int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
	
	moveZero(arr);
	
	System.out.println("The array with all zeros at end is ");
	for(int i = 0 ; i <arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}


}

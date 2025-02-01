//Write code to print a 2×2 matrix in a spiral format



import java.util.Scanner;

public class Print2DSpiralFormat {
public static void printSpiral(int m , int n , int arr[][])
{
	
	int i;
	int k=0; // starting index of row; // m is ending index of row.
	int l=0; //starting index of column; // n is ending index of column.
	
	
   while((k<m) && (l<n))
   {
	   for(i =l ; i<n ;++i)
	   {
		   System.out.print(arr[k][i]+" ");
	   }
		   k++;
   for(i=k ; i< m ; ++i)
   {
	   System.out.print(arr[i][n-1] + " ");
   }
        n--;
 if(k<m)
 { for(i= n-1;i>=l ;--i)
 {
	 System.out.print(arr[m-1][i]+" ");
 }
 m--;
 }
 if(l<n)
 {
	 for(i=m-1;i>=k;--i)
	 {
		 System.out.print(arr[i][l] + " ");
	 }
 l++;
 }
   }
	      
	
}
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter row ");
	int r = sc.nextInt();
	System.out.println("Enter column ");
	int c = sc.nextInt();
	
	int arr[][] = new int [r][c];

	System.out.println("Enter the 2D Matrix ");
	 for(int i=0 ; i<r ; i++)
	 { 
		 for(int j=0;j<c ;j++)
		{arr[i][j]=sc.nextInt();}
	//System.out.println();
	 }
	     sc.close();
		printSpiral(r,c,arr);
}

}

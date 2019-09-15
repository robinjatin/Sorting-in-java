package sorting;
import java.util.Scanner;
public class Bubble {
	public static void bsort(int A[])
	{
		int n=A.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(A[i]>A[j]) 
				{
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int A[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		bsort(A);
		
		sc.close();
	}

}

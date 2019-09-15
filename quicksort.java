package sorting;
import java.util.Scanner;
public class Quicksort {
	public static int partition(int arr[],int l,int h)
	{
		int i=l-1;
		int pivot=arr[h];
		for(int j=l;j<h;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp1=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp1;
		return i+1;
	}
	public static void quicksort(int arr[],int l,int h) 
	{
		if(l<h)
		{
			int pi=partition(arr,l,h);
			quicksort(arr,l,pi-1);
			quicksort(arr,pi+1,h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		quicksort(arr,0,n-1);
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

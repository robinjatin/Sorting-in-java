package sorting;
import java.util.Scanner;
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=0,j=0;
		for(int i=1;i<n;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				arr[j]=key;
				j--;
			}
			//arr[j+1]=key; 
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

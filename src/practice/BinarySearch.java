package practice;

import java.util.Scanner;

public class BinarySearch
{
	
	public static void search(int a[], int x1, int low, int high)
	{
		int mid= (high+low)/2;

		while(low <= high)
		{
			if(x1 == a[mid])
			{
				System.out.println("Element found at postion"+" "+(mid+1));
				break;
			}
			else if (x1 < a[mid]) 
			{
				high = mid-1;
				
			}
			else
			{
				low = mid+1;
				
			}
			mid = (high+low)/2;
		}
		if(low > high)
		{
			System.out.println("Element not found..!!!!!");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array....");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements..");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be search");
		int x = sc.nextInt();
		search(a, x, 0, size-1);
	}
}

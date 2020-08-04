package practice;

import java.util.Scanner;

public class Bubblesort 
{
	public void searching(int a[], int size)
	{
		int temp;
		
		for (int i = 0; i < a.length-1; i++)
		{
			for (int j = 0; j < a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Bubblesort bubbleSortObj = new Bubblesort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array..");
		int size = sc.nextInt();
		int a[];
		a = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		bubbleSortObj.searching(a, size);
		System.out.println();
		System.out.println("After sorting........!!!!!!!!");
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

package practice;

import java.util.Scanner;

public class InsertionSort
{
	static void sorting(int a1[], int n)
	{
		int temp;
		for (int i = 1; i < n; i++)
		{
			temp = a1[i];
			int j = i-1;
			while(j>=0 && a1[j]>temp)
			{
				a1[j+1] = a1[j];
				j--;
			}
			a1[j+1] = temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array!!");
		int size = sc.nextInt();
		int a[];
		a = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println();
		for (int j = 0; j < a.length; j++)
		{
			System.out.print(a[j]+" ");
		}
		sorting(a, size);
		System.out.println();
		System.out.println("After sorting by insertion sort!!");
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

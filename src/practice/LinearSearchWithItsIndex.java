package practice;

import java.util.Scanner;

public class LinearSearchWithItsIndex 
{
	int index(int a1[], int x2)
	{
		int index = 0;
		for (int i = 0; i < a1.length; i++)
		{
			if(a1[i] == x2)
				index = i;
		}
		return index; 
	}
	void search(int a[], int x1)
	{
		int flag = 0;
		int index = 0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] == x1)
			{
				flag = 1; 
			}
		}
		
		if(flag == 1)
		{
			index = index(a, x1);
			System.out.println("Element found at "+index);
		}
		else
		{
			System.out.println("Not found.....!!!!!!!!!!!!!!!!!!");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]= {2,4,5,7,1,5};
		int x;
		System.out.println("Enter the element to be search");
		x = sc.nextInt();
		LinearSearchWithItsIndex al = new LinearSearchWithItsIndex();
		al.search(a, x);				
	}
}

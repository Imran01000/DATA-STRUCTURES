package practice;

import java.util.Scanner;

public class StaticQueue 
{
	static StaticQueue queueObj = new StaticQueue();
	final int size = 6;
	int front = 0;
	int rear = 0;
	int a[] = new int[size];
	
	void queueStatic(int array[], int capacity)
	{
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println();
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Traverse");
			System.out.println("4.Exit");
			System.out.println("Enter your choice..!!");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
			{
				System.out.println("Enter the element");
				int item = sc.nextInt();
				insert(item);
			}
			case 2:
			{
				int deletedItem = delete();
				System.out.println("Deleted element is "+deletedItem);
			}
			case 3:
			{
				
			}
			case 4:
			{
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
	
	void insert(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full!!!!!!");
		}
		else
		{
			a[rear] = data;
			data++;
		}
	}
	
	int delete()
	{
		if(isEmpty())
		{
			System.out.println("Nothing is there!!!!!!");
		}
		else
		{
			for (int i = 0; i < a.length; i++) 
			{
				a[i] = a[i+1];
			}
		}
		return a[front];
	}
	
	void traverse()
	{
		if(isEmpty())
		{
			System.out.println("Nothing is there!!!!!!");
		}
		else
		{
			System.out.print("Queue elements are ");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println(a[i]);
			}
		}
	}
	boolean isFull()
	{
		if(rear == size-1)
			return true;
		return false;
	}
	
	boolean isEmpty()
	{
		if(rear == front)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		queueObj.queueStatic(queueObj.a, queueObj.size);
	}
}

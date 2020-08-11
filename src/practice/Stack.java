package practice;

import java.util.Scanner;

public class Stack 
{
	static final int size = 6;
	static int a[] = new int[size];
	static int top = -1;
	static int data;
	static void stack(int a[], int size)
	{
		size = Stack.size;
		Scanner inputTaker = new Scanner(System.in);
		while (true) 
		{
			System.out.println();
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.traverse");
			System.out.println("5.qiut");
			System.out.println();
			System.out.println("Enter your choice.....");
			int ch = inputTaker.nextInt();
			
		switch (ch)
			{
			case 1: 
			{
				System.out.println("Enter the element");
				int item = inputTaker.nextInt();
				push(item);
				break;
				
			}
			case 2: 
			{
				data = pop();
				System.out.println();
				System.out.println("Poped element is  "+data);
				break;
			}
			case 3: 
			{
				data = peek();
				System.out.println("Peek element is  "+data);
				break;
			}
			case 4: 
			{
				traverse();
				break;
			}
			case 5: 
			{
				System.out.println("Quit!!!!!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " +ch);
			}
		}
	}
	static boolean isFull()
	{
		if(top == size-1)
		{
			return true;
		}
		return false;
	}
	static boolean isEmpty()
	{
		if(top < 0)
		{
			return true;
		}
		return false;
	}
	static void push(int element)
	{
		if(isFull())
		{
			System.out.println("Stack is overflow!!!!!");
		}
		else
		{
			top++;
			a[top] = element;
			System.out.println(element+" "+"inserted..");
		}
	}
	
	static int pop()
	{
		if (isEmpty())
		{
			System.out.println("Stack is underflow");
			return 0; 
		}
		else
		{
			return a[top--];
		}
	}
	
	static int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		else
		{
			System.out.println("The top element of stack is "+a[top]);
			return a[top];
		}
	}
	
	static void traverse()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			System.out.println("Stack elements are...");
			System.out.println();
			for (int i = 0; i < size; i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		stack(a, size);
		
	}
}

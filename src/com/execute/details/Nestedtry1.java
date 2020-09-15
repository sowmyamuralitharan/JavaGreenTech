package com.execute.details;

public class Nestedtry1 {

	public static void main(String[] args) {

		try
		{
			System.out.println("enter try 1");
			try
			{
				System.out.println("enter try 2");
				try
				{
					 int arr[] = { 1, 2, 3, 4 }; 
	                    System.out.println(arr[10]);
					System.out.println("enter try 3");
					try
					{
						int a = 10;
						int b = 0;
						int c = a/b;
						System.out.println(c);
						System.out.println("enter try 4");
					}
					catch(ArithmeticException e)
					{
						System.out.println("enter catch 1");
					}
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("enter catch 2");
				}
			}
			catch(NullPointerException e)
			{
				System.out.println("enter catch 3");
			}
		}
		catch(Exception e)
		{
			System.out.println("enter catch 4");
		}
		System.out.println("i am out");
	}
}
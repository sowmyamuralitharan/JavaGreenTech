package com.execute.details;

public class Multicatch1 {

	public static void main(String[] args) {
	/*	-----------------------------------------------------
		try
		{
			int x = 10/0;
			 int a[]=new int[5];    
             
             System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			 System.out.println("arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("arrays");
		}
		catch(NullPointerException e)
		{
			 System.out.println("null pointer");
		}
		catch(Exception e)
		{
			 System.out.println("main");
		}
		
		 System.out.println("am out");
		 
		 
		 -----------------------------------------------*/
		 
		 
		 try
		 {

				int x = 10/0;
				 int a[]=new int[5];
			 System.out.println("i am in try");
		 }
		 catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
		 {
			 System.out.println("i am in main catch");
		 }
		 catch(Exception e)
		 {
			 System.out.println("i am in main");
		 }
		 
		 System.out.println("i am out");
		 
	}
}
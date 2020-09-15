package com.execute.details;

import java.io.IOException;

public class TryCatch1 {

	public static void main(String[] args) {
		
	//	int d = 20/0;
		
	//	System.out.println(d);
		
		try
		{
			
			//int s = 100/0;
			int a[] = {1,2,3,4};
			System.out.println(a[10]);
			System.out.println("i am in try");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println(e);
			//int f = 50/0;
			System.out.println("i am here in catch");
			//System.out.println(f);
			
		}
		
		System.out.println("i am out");	
		
	}
}

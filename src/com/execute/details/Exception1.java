package com.execute.details;

public class Exception1 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 0;
		
		try {
			
			int c = a/b;
		}
		
		catch(ArithmeticException  e){
			
			//e.printStackTrace();
			System.out.println(e);
			
		}
		
		
		
		
		
	}

}

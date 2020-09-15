package com.execute.details;

public class Ttrow1 {

    static void fun() 
    { 
        try
        { 
            throw new NullPointerException("demo"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Caught inside fun()."); 
            throw e; // rethrowing the exception 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        try
        { 
            fun(); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Caught in main."); 
        } 

		
	}

}
/*
static void validate(int age){  
    if(age<18)  
     throw new ArithmeticException("not valid");  
    else  
     System.out.println("welcome to vote");  
  }  
  public static void main(String args[]){  
     validate(13);  
     System.out.println("rest of the code...");  */
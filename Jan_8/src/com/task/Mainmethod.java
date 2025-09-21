package com.task;

public class Mainmethod 
{
	public static void main(String[] args)throws Exception
	{
		MyAutoClosable m = new MyAutoClosable();
		 try (m) 
		 {
	        m.display(null); // This will throw a RuntimeException
	     } 
		 catch (RuntimeException e) 
		 {
	        System.out.println("Caught RuntimeException: " + e.getMessage());
	     }
	     try (m) 
	     {
	         m.display("No exception here"); // This will not throw any exception
	     }
	}
}

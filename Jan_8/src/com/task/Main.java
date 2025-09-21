package com.task;

public class Main 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		HandleNullPointerException h= null;
		
            if (h == null) 
            {
                h = new HandleNullPointerException();
                h.display("Handling NullPointerException");
            }
            else 
            {
                h.display("Handling NullPointerException");
            }		
    }
}

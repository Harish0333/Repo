package com.task2;

public class NumberPrinter 
{
	 private int currentNumber = 1;
	    // A synchronized method to print prime numbers
	    public synchronized void printPrime() 
	    {
	        while (currentNumber <= 100) 
	        {
	            if (isPrime(currentNumber)) 
	            {
	                System.out.println(currentNumber);
	                currentNumber++;
	                // Notify the waiting thread to print even number
	                notify();
	            } 
	            else 
	            {
	                // Wait for the even thread to notify
	                try 
	                {
	                    wait();
	                } 
	                catch (InterruptedException e) 
	                {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

// A synchronized method to print even numbers
public synchronized void printEven() 
{
    while (currentNumber <= 100) 
    {
        if (currentNumber % 2 == 0) 
        {
            System.out.println(currentNumber);
            currentNumber++;
            // Notify the waiting thread to print prime number
            notify();
        } 
        else {
            // Wait for the prime thread to notify
            try 
            {
                wait();
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

// Helper method to check if a number is prime
	private boolean isPrime(int num) 
	{
	    if (num <= 1) 
	    	{
	    	return false;
	    	}
	    if (num <= 3)
	    	{
	    	return true;
	    	}
	    if (num % 2 == 0 || num % 3 == 0) 
	    	{
	    	return false;
	    	}
	    for (int i = 5; i * i <= num; i = i + 6) 
	    {
	        if (num % i == 0 || num % (i + 2) == 0) 
	        	{
	        	return false;
	        	}
	    }
	    return true;
	}
}

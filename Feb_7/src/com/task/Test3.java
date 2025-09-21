package com.task;

class Job extends Thread 
{
    private Integer number = 0;
    public void run() 
    {
        for (int i = 1; i <= 100; i++) 
        {
            number++;           
        }
    }
    public Integer getNumber() 
    {
        return number;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Job thread = new Job();
        thread.start();
		try
		{
			thread.join();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
        System.out.println(thread.getNumber());
    }
}

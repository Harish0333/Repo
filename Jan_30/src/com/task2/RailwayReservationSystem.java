package com.task2;
/*Program 01:
----------
Write a program in java to show the drawback of Multithreading by booking Railway Reservation System.

In this scenario, only 1 seat is available and two threads are accessing this seat to book the ticket. 

Write a Program to show that both the thread will get the ticket.
*/
public class RailwayReservationSystem 
{
	private static int availableSeats = 1;
	public static void main(String[] args) 
	{
        // Creating two threads for booking
        Thread thread1 = new Thread(new BookingThread(), "Passenger 1");
        Thread thread2 = new Thread(new BookingThread(), "Passenger 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
	static class BookingThread implements Runnable 
	 {
	    @Override
	    public void run() 
	    {
	        // Simulate the process of checking and booking a seat
	        bookTicket();
	    }
	
	    private void bookTicket() 
	    {
	        if (availableSeats > 0) 
	        {
	            // Some processing time to simulate real-world scenario
	            try 
	            {
	                Thread.sleep(100); // Simulating processing time
	            } 
	            catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	            // Book the seat
	            System.out.println(Thread.currentThread().getName() + " booked a ticket.");
	            availableSeats--;
	
	            // Display the remaining seats
	            System.out.println("Seats available: " + availableSeats);
	        } 
	        else 
	        {
	            System.out.println(Thread.currentThread().getName() + " couldn't book a ticket. No seats available.");
	        }
	    }
	 }
}

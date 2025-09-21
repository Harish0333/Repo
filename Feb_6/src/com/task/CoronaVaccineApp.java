package com.task;

public class CoronaVaccineApp {

	public static void main(String[] args) 
	{
		User user1 = new User("Ramesh", 45, true);
        User user2 = new User("Suresh", 12, false);

        // Simulating concurrent user interactions using threads
        Thread thread1 = new Thread(() -> {
            user1.bookDose();
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(100); // introducing delay for simulation
                if (!user2.isEligible()) {
                    System.out.println("Suresh is not eligible for the vaccine.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();	
	}
}

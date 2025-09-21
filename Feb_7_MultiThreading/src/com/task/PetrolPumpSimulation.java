package com.task;
/*Your task is to create a Java program that simulates a scenario where multiple cars arrive at a petrol pump for refilling. 
  The program should utilize multithreading concepts with synchronization to manage concurrent refilling operations at the petrol pump. 
  The main goal is to observe and record which car completes the refilling process first.

Instructions:

PetrolPump Class:

Create a PetrolPump class with the following attribute and method:
refillCar(String carName): A synchronized method simulating the refilling process. Ensure that only one car can execute this method at a time.
Simulation Details:
In the refillCar method, print messages to indicate when a car starts and completes refilling. Use the format: <CarName> started refilling... 
and <CarName> completed refilling!.
Implement a sleep period in the refillCar method (e.g., Thread.sleep(3000)) to simulate the time it takes for a car to refill.

Car Class:

Create a Car class that implements the Runnable interface. Include the following members:
name (String): The name of the car.
petrolPump (PetrolPump): A reference to the petrol pump.
run(): Implement the run method from the Runnable interface. 
Inside this method, call the refillCar method of the petrol pump to simulate the refilling process.

PetrolPumpSimulation Class (Main):

In the main method, create an instance of PetrolPump.
Create an array of Car objects, each initialized with a unique name and the reference to the petrol pump.
Create an array of Thread objects to represent each car's thread.
Start each car thread and wait for all car threads to complete using the join method.


Notes:

Use the synchronized keyword to achieve synchronization .
Ensure proper exception handling for InterruptedException.
Your implementation should be well-documented with comments explaining the logic of each class and method.
Adjust the sleep time and other parameters based on your desired simulation.
*/
public class PetrolPumpSimulation 
{
	public static void main(String []args)
	{
		PetrolPump petrolPump=new PetrolPump();
		
		Car []car= {new Car("Car 1", petrolPump),
				new Car("Car 2", petrolPump),
				new Car("Car 3", petrolPump),
				new Car("Car 4", petrolPump)};
		
		Thread []threads=new Thread[car.length];
		
		for(int i=0;i<car.length;i++)
		{
			threads[i]=new Thread(car[i]);
			threads[i].start();
		}
		for(Thread thread:threads)
		{
			try
			{
				thread.join();
			}
			catch(InterruptedException e) 
			{
                e.printStackTrace();
			}
		}
	}
}

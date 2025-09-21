package com.task4;

public class Veterinarian 
{
	public void performHealthCheckup(Animal animal) 
	{
        // Common health check logic
        System.out.println("Performing health checkup...");
        animal.HealthCheck();
        System.out.println("Total health checkups for this animal: " + animal.getHealthCheckups());
    }
}

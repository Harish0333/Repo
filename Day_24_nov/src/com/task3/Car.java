package com.task3;

public class Car extends Engine 
{
	private String carsmake;
	private String model;
	private int yearofmanufacture;
	private Engine engine;
	
	public Car(String carsmake, String model, int yearofmanufacture,double enginecapacity, String fueltype, int horsepower) 
	{
		super(enginecapacity,fueltype,horsepower);
		this.carsmake = carsmake;
		this.model = model;
		this.yearofmanufacture = yearofmanufacture;
		this.engine=new Engine(enginecapacity,fueltype,horsepower);
	}
	public void start() 
	{
        System.out.println(yearofmanufacture + " " + carsmake + " " + model + " starting...");
        engine.start();
    }
}

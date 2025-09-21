package com.task;

public class Product 
{
	private int id;
	private String name;
	private String description;
	private double price;
	
	public Product(int id, String name, String description, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	protected int getId() {
		return id;
	}

	protected String getName() {
		return name;
	}

	protected String getDescription() {
		return description;
	}

	protected double getPrice() {
		return price;
	}
	
}

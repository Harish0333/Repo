package com.nit;

public class Customer 
{
	private String name;
	private int id;
	public Customer(String name , int id) //constructor
	{
		this.name=name;
		this.id=id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}

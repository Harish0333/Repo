package com.hw.Has_a_relation;

public class Laptop 
{
	private String laptopbrand;
	private String laptopname ;
	private int price;
	private MotherBoard motherboard;
		
	public Laptop(String laptopbrand, String laptopname, int price) 
	{
		super();
		this.laptopbrand = laptopbrand;
		this.laptopname = laptopname;
		this.price = price;
		this.motherboard = new MotherBoard("AMD Ryzen 5", "Windows 11", 4,1);
	}

	public String getLaptopbrand() 
	{
		return laptopbrand;
	}

	public void setLaptopbrand(String laptopbrand) 
	{
		this.laptopbrand = laptopbrand;
	}

	public String getLaptopname() 
	{
		return laptopname;
	}

	public void setLaptopname(String laptopname) 
	{
		this.laptopname = laptopname;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public MotherBoard getMotherboard() 
	{
		return motherboard;
	}

	public void setMotherboard(MotherBoard motherboard) 
	{
		this.motherboard = motherboard;
	}

	@Override
	public String toString() 
	{
		return "Laptop [laptopbrand=" + laptopbrand + ", laptopname=" + laptopname + ", price=" + price
				+ ",\nMotherboard=" + motherboard + "]";
	}
}

package com.task2;

public class Zomato {

	public static void main(String[] args) 
	{
		Order o=new Order(1230,"Allo sabji",230);
		Customer c=new Customer(115,"Shankar","Jubile hills",o);
		
		System.out.println(o.toString());
		System.out.println(c.toString());
	}

}

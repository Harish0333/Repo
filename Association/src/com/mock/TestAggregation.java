package com.mock;

public class TestAggregation 
{
	public static void main(String[] args) 
	{
		Address add = new Address("21", "Hyderabad", "Telengana");
		Student2 st1 = new Student2("Rahul", 1, add);
		System.out.println(st1);
		add = null;
		st1.setAdd(add);
		System.out.println(st1);

		Engine e = new Engine(4, "Petrol");
		Bike b = new Bike("RTR160", "TVS", "2021", e);
		System.out.println(b);
		
		st1.driving(b);
	}
}

package com.nit;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		int val=100;
		Customer c = new Customer("Ravi",2);

        m1(c);
		
		//GC [only one object is eligible for GC i.e 3000]

		System.out.println(c.getId());
	}

	public static void m1(Customer cust)
	{
		cust.setId(5);

	    cust = new Customer("Rahul",7);

		cust.setId(9);
		System.out.println(cust.getId());//9
	}

}

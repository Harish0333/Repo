package com.task1;
/*What is the output of following Program? Create Heap and Stack diagram for the following Program.*/
class Customer

{
	private String name;
	private int id;

	public Customer(String name , int id)
	{
		this.name=name;
		this.id=id;
	}

	public void setId(int id) //setter  
	{
		this.id=id;
	}

	public int getId() //getter
	{
		return id;
	}
}

class MyProgram
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("Ravi",2);
		m1(c);
		//GC
		System.out.println(c.getId());
	}

	public static void m1(Customer c)
	{
		c.setId(5);
		c = new Customer("Rahul",7);
		c.setId(9);
		System.out.println(c.getId());
	}
}

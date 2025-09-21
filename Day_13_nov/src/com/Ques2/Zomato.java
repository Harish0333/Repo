package com.Ques2;
/*Create a class Order (Business Logic Class)

 Instance Variables:
 private int orderId;
 private String itemName;
 private double itemPrice;

 Create a parameterized constructor initialize the instance variable of the class.
 Override toString() from Object class to print Order class properties.
 Create a class Customer (Business Logic Class)

 Instance Variables:
 private int customerId;
 private String customerName;
 private String customerAddress;
 private Order order; //HAS-A relation
 Create a parameterized constructor initialize the instance variable of the class.
 Override toString() from Object class to print Customer class properties.
 
 Create a class Zomato (Executable Logic Class) which contains main method to print Customer class properties using toString() method.
Output:
Customer[
 Customer Id: 232
 Customer Name: Ravi Kumar
 Customer Addres: Ameerpet
 Order[ Order ID: 24, Item Name: Burger, Item Price: 149.0 ]
]*/
public class Zomato 
{
	public static void main(String[] args) 
	{
		Order ord=new Order(232,"Burger",149.0);
		Customer cs=new Customer(242,"Harish","Amerpeta",ord);
		System.out.println(cs);

	}

}

package com.task2;
/*Design a Ticket class with attributes like event name, seat number, and price.

1.Create a class Ticket
Instance variable:-
String eventName,private
int seatNumber,private
double price,private

Create a parameterized constructor for all Instance variable to initialize the variable.
Generate Getters and setters for all Instance variable to get values and set values.

2.Create another class VIPTicket and inherit Ticket class here.

Instance variable:-
String specialAccess,private

Create a parameterized constructor for Instance variable to initialize the variable.
//Use super keyword to initialize Ticket class constructor attributes.
Generate Getters and setters for Instance variable to get values and set values.

3.Create another class StudentTicket and inherit Ticket class here.
Instance variable:-
boolean studentDiscount,private

Create a parameterized constructor for Instance variable to initialize the variable.
//Use super keyword to initialize Ticket class constructor attributes.
Generate Getters and setters for Instance variable to get values and set values.

Create a class MainTicket which contains main method to demonstrate the usage.
//Creating a Ticket object using the parameterized constructor
//Creating a VIPTicket object using the parameterized constructor
//Creating a StudentTicket object using the parameterized constructor

Output:-
Regular Ticket:
Event: Concert
Seat Number: 101
Price: $50.0

VIP Ticket:
Event: VIP Concert
Seat Number: 201
Price: $100.0

Special Access: Backstage Access
Student Ticket:
Event: Student Event
Seat Number: 301
Price: $30.0
Student Discount: true
*/
public class MainTicket 
{
	public static void main(String[] args) 
	{
		Ticket t1=new Ticket("Concert", 101, 50);
		VIPTicket vip1=new VIPTicket("VIP Concert",201, 100,"BackStage Access");
		StudentTicket st1=new StudentTicket("Student Event", 301, 30, true);
		System.out.println(t1);
		System.out.println(vip1);
		System.out.println(st1);
	}
}

package com.task2;
/*Consider a scenario where you are developing a class to represent a Book in a library management system. 
  As part of this design, you need to leverage constructor overloading to handle different cases of book instantiation.

Instructions:
Implement a default constructor for the Book class that initializes default values for the book's title, author, and ISBN.

Create a parameterized constructor that takes the title and author as parameters, allowing the instantiation of a book with the specified title 
and author while assigning a default value for the ISBN.

Extend the Book class with another parameterized constructor that includes all three parameters: title, author, and ISBN. 
This constructor should enable the explicit specification of the ISBN when creating a Book object.

Overload the constructor further by adding a new variant that takes the title, author, ISBN, and the number of pages in the book. 
This constructor should provide the option to include the number of pages as part of the book's details.

Demonstrate the use of these overloaded constructors in the main method of a separate class. 
Create instances of the Book class using different constructors, showcasing scenarios where only basic information or additional details, 
such as ISBN or the number of pages, are provided during object creation.

Discuss the advantages of constructor overloading in this context, highlighting how it enhances the flexibility and 
ease of use of the Book class for various instantiation scenarios.

Note: Follow Java naming conventions, use appropriate data types, and provide necessary accessor methods in the Book class.*/
public class Main {

	public static void main(String[] args) 
	{
		 	Book book1 = new Book();  // Default constructor
	        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger");  // Title and author only
	        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");  // Title, author, and ISBN
	        Book book4 = new Book("1984", "George Orwell", "9780451524935", 328);// Title, author, and ISBN,pages
	        
	        System.out.println(book1);
	        System.out.println(book2);
	        System.out.println(book3);
	        System.out.println(book4);
	}

}

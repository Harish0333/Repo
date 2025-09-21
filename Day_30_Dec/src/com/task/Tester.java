package com.task;
/*Consumer Interface:
Scenario: You are working on an e-commerce application, and you want to implement a shopping cart feature 
that calculates the total price of the items and applies discounts if applicable.

Implement a Consumer interface that calculates the total price of the items in the cart.
Use the Consumer interface to apply a discount of 10% to the total price if the
totalPrice is above 1000000.

Requirements : 
-----------------

Class Name : CartItem
Artributes : private String name,private double price, private int quantity;
Constructor: parameterzed constructor to initialize CarItem fields
method     : double getTotalPrice() which returns total price as per quantity.
             String toString()

Class name : ShoppingCart
Atributes  : private CartItem items ;
Constructor: parameterized constructor to initialize ShoppingCart field
method     : setter and getter , toString();

Class name : Tester 
// Implement a Consumer interface to calculate the discount from total price . Print all the details.
void accept(ShoppingCart sc);*/
public class Tester 
{
	public static void main(String[] args) 
	{
		CartItem c=new CartItem("Pens", 10, 5);
		ShoppingCart s=new ShoppingCart(c);
		Consumer<ShoppingCart> sc=(x)->System.out.println(x);
		sc.accept(s);
		
	}
}
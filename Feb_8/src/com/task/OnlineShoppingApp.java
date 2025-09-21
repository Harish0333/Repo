package com.task;

public class OnlineShoppingApp 
{
	public static void main(String[] args)
	{
		 Product product1 = new Product(1, "Product 1", "Description for Product 1", 50.0);
	     Product product2 = new Product(2, "Product 2", "Description for Product 2", 35.0);

	      // Create users
	      User user1 = new User("User 1");
	      User user2 = new User("User 2");

	      // Simulate concurrent user interactions using threads
	      Thread thread1 = new Thread(() -> {
	          user1.addToCart(product1);
	          user1.addToCart(product2);
	          user1.placeOrder();
	      });

	      Thread thread2 = new Thread(() -> {
	          user2.addToCart(product1);
	          user2.addToCart(product2);
	          user2.placeOrder();
	      });

	      thread1.start();
	      thread2.start();
	}
	   
}

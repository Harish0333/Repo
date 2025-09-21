package com.task;

public class User 
{
	private String name;
	private ShoppingCart cart;
	public User(String name)
	{
		super();
		this.name = name;
		this.cart = new ShoppingCart();
	}
	
	public synchronized void addToCart(Product product)
	{
		cart.addItem(product);
	}
	public synchronized void viewCart()
	{
	cart.displayCartItems();	
	}
	public synchronized void placeOrder()
	{
		double totalCost = 0;
        for (int i = 0; i < cart.getItemCount(); i++) {
            totalCost += cart.getCartItems()[i].getPrice();
        }
        System.out.println("Order placed successfully! Total cost: " + totalCost);
        cart.clearCart();
	}
}

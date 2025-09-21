package com.task2;

public class User 
{
	private String name;
    private ShoppingCart cart;  

    public User(String name) 
    {
		super();
		this.name = name;
		this.cart = new ShoppingCart(null, 0);
	}

	public void addToCart(Product product) 
    {
        cart.addItem(product);
    }

    public void viewCart() 
    {
        cart.displayCartItems();
    }

    public void placeOrder() 
    {
        double totalCost = 0.0;
        for (int i = 0; i < cart.getItemCount(); i++) 
        {
            totalCost += cart.getCartItems()[i].getPrice();
        }
        System.out.println("Order placed successfully! Total cost: " + totalCost);
        cart.clearCart();
    }
}

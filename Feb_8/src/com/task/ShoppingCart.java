package com.task;

public class ShoppingCart 
{
	private Product[] cartItems;
	private int itemCount;
	private static final int MAX_CAPACITY=10;
	
	protected Product[] getCartItems() {
		return cartItems;
	}

	protected int getItemCount() {
		return itemCount;
	}

	public ShoppingCart() 
	{
		super();
		this.cartItems = new Product[MAX_CAPACITY];
		this.itemCount = 0;
	}
	
	public synchronized void addItem(Product product)
	{
		if(itemCount<MAX_CAPACITY)
		{
			cartItems[itemCount++]=product;
			System.out.println(product.getName()+" added to cart.");
		}
		else
		{
			System.out.println("Sorry, the cart is full. Cannot add more items.");
		}
	}
	public synchronized void displayCartItems() {
        System.out.println("Your Shopping Cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cartItems[i].getName() + " - " + cartItems[i].getPrice());
        }
    }

    public synchronized void clearCart() {
        itemCount = 0;
        System.out.println("Your cart has been cleared.");
    }
}

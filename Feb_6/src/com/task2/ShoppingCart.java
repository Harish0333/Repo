package com.task2;

public class ShoppingCart {
	private Product[] cartItems;
	private int itemCount;
	private static final int MAX_CAPACITY=10;
	
	public ShoppingCart(Product[] cartItems, int itemCount) {
		super();
		this.cartItems = new Product[MAX_CAPACITY];
		this.setItemCount(0);
	}
	public void addItem(Product product)
	{
		if(getItemCount()<MAX_CAPACITY)
		{
			cartItems[getItemCount()] = product;
            setItemCount(getItemCount() + 1);
        } 
		else 
		{
            System.out.println("Cannot add more items. The cart is full.");
        }
	}
	public void displayCartItems() {
        System.out.println("Your Shopping Cart:");
        for (int i = 0; i < getItemCount(); i++) {
            System.out.println(cartItems[i].getName() + " - " + cartItems[i].getPrice());
        }
    }

    public Product[] getCartItems() {
		return cartItems;
	}
	public void setCartItems(Product[] cartItems) {
		this.cartItems = cartItems;
	}
	public void clearCart() {
        setItemCount(0);
    }
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
}

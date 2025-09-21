package com.task;

public class ShoppingCart 
{
	private CartItem items ;

	public ShoppingCart(CartItem items) 
	{
		super();
		this.items = items;
	}

	protected CartItem getItems() 
	{
		return items;
	}

	protected void setItems(CartItem items) 
	{
		this.items = items;
	}

	@Override
	public String toString() 
	{
		return "ShoppingCart [items=" + items + "]";
	}	
}

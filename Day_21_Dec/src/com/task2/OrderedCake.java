package com.task2;
public class OrderedCake extends Cake 
{
	private String message;
	public OrderedCake() 
	{
		super("round", "Vanilla", 1);
		setPrice(400);
	}
	public OrderedCake(String shape, String flavour,  int qty) 
	{
		super(shape, flavour, qty);
		setPrice(400*qty);
	}
	public OrderedCake(String shape, String flavour, int qty, String message) 
	{
		super(shape, flavour, qty);
		this.message = message;
		setPrice(400*qty);
	}
	@Override
	public void showCake()
	 {
		if(message!=null && !message.isEmpty())
		{
			System.out.println("A "+this.getShape()+" "+this.getFlavour()+" Cake Of "+this.getQty()+" Kg/Kg'with "+this.message+" @ Rs."+this.getPrice()+"/-");
		}
		else
		{
			System.out.println("A "+this.getShape()+" "+this.getFlavour()+" Cake Of "+this.getQty()+" Kg/Kg' at @ Rs."+this.getPrice()+"/-");
		}
		 
	 }
	
}

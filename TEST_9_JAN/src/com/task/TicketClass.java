package com.task;

class InvalidTicketPriceException extends Exception 
{
    public InvalidTicketPriceException(String message) 
    {
        super(message);
    }
}
public class TicketClass 
{
	
	 private String name;
	 private int seatNumber;
	 private double price;
	
	 public TicketClass(String name, int seatNumber, double price) 
	 {
		super();
		this.name = name;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getSeatNumber() {
		return seatNumber;
	}

	protected void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}
	 
	 public void setPriceWithValidation(double price)throws Exception
	 {
		  if(price<=0)
			 {
				 throw new InvalidTicketPriceException("Price cannot be zero or negative.") ;
			 }
		  this.price=price;
	 }
}

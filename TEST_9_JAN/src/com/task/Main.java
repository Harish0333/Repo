package com.task;

public class Main 
{

	public static void main(String[] args) throws Exception
	{
		TicketClass ticket = new TicketClass("Concert", 101,190.00);
        try
        {
            ticket.setPriceWithValidation(0);
            System.out.println("Event Name: " + ticket.getName());
            System.out.println("Seat Number: " + ticket.getSeatNumber());
            System.out.println("Price: " + ticket.getPrice());
        } 
        catch (InvalidTicketPriceException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
   }
}

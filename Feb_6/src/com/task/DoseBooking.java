package com.task;

public class DoseBooking
{
	private boolean booked;

	public void bookDose()
	{
		if (booked) 
		{
            throw new RuntimeException("Dose already booked.");
        }
        booked = true;		
	}
	public boolean isDoseBooked()
	{
		return booked;
	}
}

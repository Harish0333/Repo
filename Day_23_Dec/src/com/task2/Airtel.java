package com.task2;

public class Airtel implements SIMCard 
{
	boolean active;

	@Override
	public long gettingPhoneNumber() {

		return (long) (Math.random() * 10000000000l);
	}

	@Override
	public String networkProvider() {

		return Airtel.class.getSimpleName();
	}

	@Override
	public void activation() {
		active = true;

	}

	@Override
	public void deActivation() {
		active = false;

	}

	@Override
	public boolean isActive() {
		return active;
	}
}

package com.task2;

public interface SIMCard 
{
	public abstract long gettingPhoneNumber();

	public abstract String networkProvider();

	public abstract void activation();

	public abstract void deActivation();

	public abstract boolean isActive();

	
}

package com.task2;

public interface MobilePhone 
{
	public abstract void insertSim(SIMCard s);

	public abstract void removeSim(SIMCard s);

	public abstract void makeCalls(SIMCard s);

	public abstract void sendText(SIMCard s);
}


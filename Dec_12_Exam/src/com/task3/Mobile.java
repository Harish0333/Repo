package com.task3;

public class Mobile 
{
	public void insertSim(Sim sim)
	{
		System.out.println("new sim inserted");
		sim.call();
		sim.sms();
	}
	public void insertSim(Jio jio)
	{
		System.out.println("Jio sim inserted");
		jio.call();
		jio.sms();
	}
	public void insertSim(Airtel airtel)
	{
		System.out.println("Airtel sim inserted");
		airtel.call();
		airtel.sms();
	}
	public void insertSim(Vodafone v)
	{
		System.out.println("Vodafone sim inserted");
		v.call();
		v.sms();
	}
}

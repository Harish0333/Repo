package com.task3;
public class Main {
	public static void main(String[] args) 
	{
		Jio j=new Jio("Micro","Red & Silver");
		Airtel a=new Airtel("Nano","Tomato red");
		Vodafone v=new Vodafone("Standard","Orange");
		Mobile mobile=new Mobile();
		Sim s=new Sim("Nano","Blue");
		System.out.println(s);
		mobile.insertSim(s);
		System.out.println();
		mobile.insertSim(a);
		System.out.println();
		mobile.insertSim(j);
		System.out.println();
		mobile.insertSim(v);		
	}
}

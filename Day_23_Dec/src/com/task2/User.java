package com.task2;

public class User {

	public static void main(String[] args) 
	{
		  SIMCard s = new Jio();
	      Mobile m = new Mobile();
	      
	      m.insertSim(s);
	      m.makeCalls(s);
	      m.sendText(s);
	      m.removeSim(s);
	      
	      System.out.println("-----------------------------------------------------");
	      s = new Airtel();
	      m.insertSim(s);
	      m.makeCalls(s);
	      m.sendText(s);
	      m.removeSim(s);
	      

	}

}

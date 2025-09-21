package com.task2;

public class Mobile implements MobilePhone {

	@Override
	public void insertSim(SIMCard s) {
		System.out.println(s.getClass().getSimpleName()+" inserted in mobile");
		s.activation();
		System.out.println("SIm number is : "+s.gettingPhoneNumber());
		System.out.println("Sim card network : "+s.networkProvider());
	}

	@Override
	public void removeSim(SIMCard s) {
		System.out.println(s.getClass().getSimpleName()+" removed from mobile");
		s.deActivation();

	}

	@Override
	public void makeCalls(SIMCard s) {
		if(s.isActive()) {
		System.out.println("Calling from : " + s.networkProvider());
		
		}
		else {
			System.out.println(s.getClass().getSimpleName()+" Sim is not activated....");
		}

	}

	@Override
	public void sendText(SIMCard s) {
		if(s.isActive())
		System.out.println("Texting from :" + s.networkProvider());
		else {
			System.out.println(s.getClass().getSimpleName()+"Sim is not activated....");
		}

	}

}

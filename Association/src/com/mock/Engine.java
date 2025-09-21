package com.mock;

public class Engine {
	private int noOfStokes;
	private String type;

	public Engine(int noOfStokes, String type) {
		super();
		this.noOfStokes = noOfStokes;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [noOfStokes=" + noOfStokes + ", type=" + type + "]";
	}

}

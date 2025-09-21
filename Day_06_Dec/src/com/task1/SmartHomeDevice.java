package com.task1;

public class SmartHomeDevice 
{
	private String type;
	private boolean status;
	
	public SmartHomeDevice(String type) 
	{
		super();
		this.type = type;
		this.status = false;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void turnOn()
	{
		System.out.println(type +" Is turn on");
	}
	public void turnOff()
	{
		System.out.println(type +" Is turn Off");
	}

	@Override
	public String toString() {
		return "SmartHomeDevice [type=" + type + ", status=" + status + "]";
	}
	
}

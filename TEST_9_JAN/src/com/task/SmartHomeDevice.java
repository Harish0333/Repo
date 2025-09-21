package com.task;

class DeviceAlreadyOnException extends RuntimeException
{
	public DeviceAlreadyOnException(String message) 
	{
        super(message);
    }
}
class DeviceAlreadyOffException extends RuntimeException
{
	public DeviceAlreadyOffException(String message) 
	{
        super(message);
	}
}
public class SmartHomeDevice 
{
	 private String type;
	 private boolean status;
	 
	public SmartHomeDevice(String type, boolean status) 
	{
		super();
		this.type = type;
		this.status = false;
	}
	
	 protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected boolean isStatus() {
		return status;
	}

	protected void setStatus(boolean status) {
		this.status = status;
	}

	public void turnOn()
	 {
		if(status)
		{
			throw new DeviceAlreadyOnException("Device is already turned on.");
		}
		 System.out.println(type+" is now ON.");
		 this.status=true;
	 }
	 public void turnOff()
	 {
		 if(!status)
		{
			throw new DeviceAlreadyOffException("Device is already turned off.");
		}
		 System.out.println(type+" is now OFF.");
		 this.status=false;
	 }
}

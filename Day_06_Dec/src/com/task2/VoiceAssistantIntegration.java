package com.task2;

public class VoiceAssistantIntegration extends SmartHomeDevice
{
	public VoiceAssistantIntegration(String type)
	{
		super(type);
	}

	public String VoiceCommand(String command)
	{
		if(command=="turn on")
		{
			 turnOn();
			 return "0";
		}
		else if(command=="turn off")
		{
			turnOff();
			 return "0";
		}
		else if(command=="dim")
		{
			System.out.println("Adjusting brightness...");
			 return "0";
		}
		else if(command=="set temperature")
		{
			System.out.println("Setting temperature...");
			 return "0";
		}
		else
		{
			return "Command not recognized.";
		}
	}
}

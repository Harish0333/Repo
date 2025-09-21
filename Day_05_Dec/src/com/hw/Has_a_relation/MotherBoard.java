package com.hw.Has_a_relation;

public class MotherBoard 
{
	private String Processor;
	private String os;
	private int graphiccard;
	private int storage;
	
	public MotherBoard(String processor, String os, int graphiccard, int storage) 
	{
		super();
		Processor = processor;
		this.os = os;
		this.graphiccard = graphiccard;
		this.storage = storage;
	}

	@Override
	public String toString() 
	{
		return "MotherBoard [Processor=" + Processor + ", OS=" + os + ", Graphic card=" + graphiccard +"GB"+ ", Storage="
				+ storage + "TB]";
	}
}

package com.mock;

public class Address 
{
	private String roadName;
	private String city;
	private String dist;

	public Address(String roadName, String city, String dist) 
	{
		super();
		this.roadName = roadName;
		this.city = city;
		this.dist = dist;
	}

	@Override
	public String toString()
	{
		return "Address [roadName=" + roadName + ", city=" + city + ", dist=" + dist + "]";
	}
}

package com.area.circle;

public class Circle {
	public static String getArea(Double radius)
	{
		double pie=3.12d;
		double area=pie*radius*radius;
		if(radius<=0)
		{
			return "0";
		}
		else 
		{	
			return String.format("%.2f", area);
		}
	}
}

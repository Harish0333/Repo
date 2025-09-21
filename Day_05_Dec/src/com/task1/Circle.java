package com.task1;
public class Circle 
{
	protected double radius;
	double PI=3.14;
	Circle()
	{
		this.radius=1.0;
	}
	
	public Circle(double radius)
	{
		super();
		this.radius=radius;	
	}
	
	public double getArea()
	{
		double area=PI*radius*radius;
		if(radius<0)
		{
			return -1;
		}
		else
		{
			return area;
		}
	}

	@Override
	public String toString() {
		return "Area= " + getArea()+",";
	}

	
	
}

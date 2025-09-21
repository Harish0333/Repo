package com.task1;
public class Cylinder extends Circle 
{
	protected double height;
	
	public Cylinder()
	{
		this.height=0;
		this.radius=0;
	}
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}

	public double getVolume()
	{
		double volume=PI*radius*radius*height;
		if(height<0)
		{
			return -1;
		}
		else
		{
			return volume;
		}
	}

	@Override
	public String toString() {
		return "Volume=" + getVolume() + ", \nArea=" + getArea() ;
		}
}

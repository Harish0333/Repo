package com.task1;

public class Cuboid extends Rectangle
{
	double height ;

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	public Cuboid()
	{
		this.height=15;
	}
	

	public double ComputeArea(double width,double length,double height)
	{
		super.ComputeArea(width, length);
		this.height=height;
		area=area*height;
		return area;
	}
	
	 @Override
	    public void show() 
	{
	        System.out.println("Cuboid - Length: " + getLength() + ", Width: " + getWidth() + ", Height: " + height);
	        super.show();
	}
}

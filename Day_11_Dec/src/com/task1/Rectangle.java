package com.task1;

public class Rectangle extends GeometricShape
{
	 double width; 
	 double length;
	
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		this.length = length;
	}
	 
	 public Rectangle()
	 {
		 this.width=10;
		 this.length=10;
	 }
	
	 @Override
	 public double ComputeArea(double width,double length) 
		{
		 	this.length=length;
		 	this.width=width;
			return width*length;
		}
	 @Override
	public void show()
		{
		System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        super.show();
		}
}

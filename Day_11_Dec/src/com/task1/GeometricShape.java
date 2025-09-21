package com.task1;

public class GeometricShape 
{
	String shapeType ; 
	double area ;
	
	public double ComputeArea(double a,double b) 
	{
		return 0.0;
	}
	
	public void show()
	{
		System.out.println("Area :"+area+"\nShape Type :"+shapeType);
		
	}
	
	public GeometricShape()
	{
		this.shapeType="Default";
		this.area=0.0;
	}
	
}

package com.task1;
/*Write a Program to find the following entities
1. Area of Geometric shape
2. Area of rectangle
3. Volume for cube
We have four classes named as GeometricShape, Rectangle, Cuboid and Test

For GeometricShape class
Instance Variables:
shapeType : String default 
area : double default

Methods: 
public double computeArea(double, double) 
public void show()

No Argument constructor with initialize shapeType and area fields

For Rectangle class is a sub class of GeometricShape
Instance Variables:
width : double default 
length : double default
Methods : set and get methods for width and length
No Argument constructor with initialize width and length as 10

@Override
computeArea(): It return width multiply by length

@Override
show() : print length, width and area of Rectangle

For Cuboid class is a sub class of Rectangle
Instance Variables:
height : double default
Methods: set and get method for height and computeArea(double ,double ,double)

No Argument constructor with initialize height as 15
computeArea() : double : multiply width and height and store into area of parent class then return area of parent class by using super keyword

@Override
show() : print width, length, height and area of cuboid
*/
public class Test 
{

	public static void main(String[] args) 
	{
		Cuboid cuboid = new Cuboid();
        cuboid.ComputeArea(5.0, 8.0, 12.0);
        cuboid.show();
	}
}

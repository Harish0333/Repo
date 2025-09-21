package com.task1;
/*Class Circle is given to you. Add below details to the class

1. Instance variables:

radius: double.

2. Create a no constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius.

4. Create below methods,

Method name: getArea

Return type: double

This method should return the area of the circle. Return -1 if radius is negative.

Create a sub class of Circle with name Cylinder that inherits and add below details to the class

1. Instance variables:

height: double.

2. Create a No constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius, height.

4. Create below methods,

Method name: getVolume

Return type: double

This method should return the volume of the cylinder. Return -1 if height is negative.

An ELC class ShapeTester is given to you with a main method. Use this class to test your

solution's classes and methods.

Expected output:
Volume =:392.5
Area =:78.5
Volume =:1356.48
Area =:113.03999999999999*/
public class ShapeTester 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle(5.0);
		c1.getArea();
        System.out.println(c1);
		//create an object to Cylinder class by passing values like (6,12)
		Cylinder c2=new Cylinder(6,12);
		//call getVolume and getArea methods and print details
		c2.getVolume();
		c2.getArea();
		System.out.println(c2);
	}
}

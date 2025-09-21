package com.Program2;
/*Program 02:
  -----------
   Create a class Rectangle with instance variables width and height. Implement an instance block that initializes
   the instance variables to 0. Implement a constructor that sets the instance variables width and height. 
   Implement an instance method getArea() that returns the area of the rectangle. Implement another instance method getPerimeter() 
   that returns the perimeter of the rectangle. Create a Rectangle object with width 5 and height 10 and call
   the getArea() and getPerimeter() methods on it.
  ----------------------------------------------------------------------*/
public class Rectangle 
{		
		double width; 
		double height;
		//instance initialization block for assigning initial values
		{
			width=0;
			height=0;
		}
		
		//parameterized constructor to assign values to instance variables
		public Rectangle(double width, double height)
		{
			this.width=width;
			this.height=height;
			
		}
		
		//instance method to calculate area of rectangle
		public double getArea() 
		{
			return height*width;
		}
		
		//instance method to calculate perimeter of rectangle
		public double getPerimeter() 
		{
			return 2*(height+width);
		}
		
		public static void main(String[] args) 
		{
	        //create an object to Rectangle class and print area and perimeter
			Rectangle r1=new Rectangle(5,10);
			System.out.println("Area of a rectangle:"+r1.getArea());
			System.out.println("Perimeter of a rectangle:"+r1.getPerimeter());
		}
	}

package com.task1;
/*Create a class to print the area of a square and a rectangle. 
 * The class has two methods with the same name but different number of parameters. 
 * The method for printing area of rectangle has two parameters which are length and breadth respetively 
 * while the other method for printing area of square has one parameter which is side of square.

Expected Output:
Area of a Square = 5.289999999999999
Area of a Rectangle = 7.589999999999999*/
public class AreaOfASquareAndRectangle 
{
	//write a method area(). which accepts side as parameter and it's type is double. return type double
	public double area(double c)
	{
		double a=c*c;
		System.out.println("Areaa of a Square ="+a);
		return a;
	}
	//write a method area(). which accepts length and  breadth as parameters and their data type is double. return type double
	public double area(double l,double b)
	{
		double a=l*b;
		System.out.println("Area of a Rectangle =" +a);
		return a;
	} 
	public static void main(String[] args) 
	{
		new AreaOfASquareAndRectangle().area(2.3);
		new AreaOfASquareAndRectangle().area(2.3,3.3);
	}
}

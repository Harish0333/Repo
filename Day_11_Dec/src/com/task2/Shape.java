package com.task2;

import java.util.Random;

public class Shape 
{
	public static Shape randshape()
	{
		switch (new Random().nextInt(3))
		{
		 case 0:
             return new Circle();
         case 1:
             return new Square();
         case 2:
             return new Triangle();
         default:
             System.out.println("Default message");
             return new Shape();
		}
	}
	public Shape()
	{
		
	}
	public void draw() 
	{
		System.out.println("Shape draw" );
	}
	public void erase()
	{
		System.out.println("Shape erase");
	}
}

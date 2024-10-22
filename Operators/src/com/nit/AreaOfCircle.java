package com.nit;

import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle :");
		int radius = sc.nextInt();
		
		double areaOfCircle = Circle.getAreaOfCircle(radius);
		System.out.println("Area of Circle is :"+areaOfCircle);
		sc.close();

	}
}

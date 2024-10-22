package com.nit;
/*
Find the area of circle. Accept the radius value from the user
if the radius is zero or negative then return -1. 
*/
//BLC
public class Circle 
{
  public static double getAreaOfCircle(int radius)
  {
	   if(radius <=0)
	   {
		   return -1;
	   }
	   else
	   {
		   final double PI = 3.14;
		   double areaOfCircle = PI * radius * radius;
		   return areaOfCircle;
	   }
  }
}

package com.task2;
import java.util.function.Function;
import java.util.Scanner;
/*Function Interface:
Scenario: You are developing a weather application that provides temperature conversion functionality.

Implement a Function interface that converts a temperature in Celsius to Kelvin.
Use the Function interface to convert a temperature in Fahrenheit to Celsius.

Function : Double apply (Double d);
*/
public class FunctionInterface 
{
	public static void main(String[] args) 
	{
		//converting a temperature in Celsius to Kelvin.
		Scanner sc=new Scanner(System.in);
		Function<Double,Double> x=(Double K)->K= K+273.15;
		
		System.out.println("Enter the temperature");
		Double T=sc.nextDouble();
		System.out.println("Kelvin :"+x.apply(T));
		
		//converting a temperature in Celsius to Fahrenheit.
		Function<Double,Double> y=(Double C)->C= (C * 9/5)+32 ;
		System.out.println("Fahrenheit:"+y.apply(T));
		sc.close();
	}
}

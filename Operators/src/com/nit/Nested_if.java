package com.nit;

public class Nested_if {

	public static void main(String[] args) 
	{
		int a =15;
		int b =12;
		int c =18;
		int big=0;   

		if(a>b)  //(Outer if condition)
		{			
			if(a>c)     //Nested If Block (inner if)        
				big=a;
			else
				big=c;
		}
		else    //already confirmed b is greater than a
		{
			if(b>c)   
				big=b;
			else
				big=c;
		}
		System.out.println("The big number is :"+big);
	}
}

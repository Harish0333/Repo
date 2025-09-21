package com.task;

public class Example19 
{
	static {
			int x = 10;//20
			Example19.x = x+x;//20
		//	System.out.println(Example19.x );
			}

	static int x;
	
	public static void main(String[] args) 
	{
		System.out.println("Class Level X : "+Example19.x);
	}

	static {
		x = x+Example19.x;//20+20
		//System.out.println(x);
	}
}

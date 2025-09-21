package com.task;

public class Example14 
{
	static int x = 10; 
	public static void main(String[] args) 
	{ 
		Example14 t1 = new Example14(); 
		Example14 t2 = new Example14(); 
		Example14 t3 = new Example14(); 
		t1.x = 20; 
		System.out.print(t1.x + " "); 
		System.out.println(t2.x);
		t2.x=30;
		System.out.println(t3.x);
	} 
}

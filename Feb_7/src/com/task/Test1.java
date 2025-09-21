package com.task;

public class Test1 
{
	public static int i = 10;
	static 
	{i+=1;}
	public static void main(String[] args) {
		Thread t  = new Thread();
		System.out.println("Before Priority : "+t.getPriority());
		t.setPriority(i);
		System.out.println("After Priority : "+t.getPriority());
	}
}

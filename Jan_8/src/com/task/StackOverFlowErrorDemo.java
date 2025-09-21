package com.task;

public class StackOverFlowErrorDemo 
{
	public void display()
	{
	System.out.println(" I am StackOverFlow");
	display();
	}
	public static void main(String[] args) 
	{
		StackOverFlowErrorDemo s=new StackOverFlowErrorDemo();
		s.display();
	}
}

package com.taskBoolean;

import com.task.Test;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread started ");
		
		Test t1=new Test();
		Test t2=new Test();
		
		t1.start();
		t2.start();
		
		System.out.println(10/0);
		System.out.println("Main thread ended ");
	}

}

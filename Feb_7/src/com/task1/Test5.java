package com.task1;

public class Test5 extends Thread
{
	 public static void main(String[] args) 
	 {
		Test5 t = new Test5();
		t.run();
		t.start();
	}
	 public void run ()
	 {
		 System.out.println("run-test");
	 }
}

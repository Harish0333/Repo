package com.task1;

public class Test {
	public static void main(String[] args) {
		for(int i = 1 ; i < 3 ; i++)
		{
			Test3 t  = new Test3();
			t.setName("Person - "+i);
			t.start();
		}
	}
}
class Test2 {
	public static synchronized void action()
	{
		System.out.println(Thread.currentThread().getName()+ " login");
		System.out.println("Work Started");
		try {
			Thread.sleep(0);
		} catch (Exception e) {
			System.out.println("Thread Interupted");
		}
	}
}
class Test3 extends Thread {
	public void run() {
		Test2.action();
	}
}

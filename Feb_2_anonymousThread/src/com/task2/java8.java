package com.task2;

public class java8 {

	public static void main(String[] args) {
		NIT thread = new NIT();
		NIT1 thread1 = new NIT1();
		
		thread.start();
		System.out.println(thread.getPriority());//5
		System.out.println(thread.isAlive());//t
		System.out.println(thread1.isAlive());//f
		thread1.start();
		System.out.println(thread1.getPriority());//5

	}

}

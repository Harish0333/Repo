package com.task3;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.run();
		System.out.println(test.a);//1
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());
	}

}

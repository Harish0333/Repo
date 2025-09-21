package com.Programs2;

public class Sample7 {
	int x = m1();  
	{
		System.out.println("NSB :" + x);
	}
	Sample7() {
		System.out.println("NPC :" + x);
	}
	Sample7(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	int m1() {
		System.out.println("NSM Executed..");
		return 50;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample7 s1 = new Sample7();
         Sample7 s2 = new Sample7(13);
         System.out.println("Main End");
         
	}
}

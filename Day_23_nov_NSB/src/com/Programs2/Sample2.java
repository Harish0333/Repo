package com.Programs2;

public class Sample2 {
	int x;

	Sample2() {
		super();
		
		System.out.println("NPC :" + x);//10
	}
	Sample2(int x) {
		this.x = x;
		System.out.println("IPC :" + x);//13
	}
	{
		x = 10;
		System.out.println("NSB :" + x);//10
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		Sample2 s1 = new Sample2();
		Sample2 s2 = new Sample2(13);
		System.out.println("Main End");

	}
}

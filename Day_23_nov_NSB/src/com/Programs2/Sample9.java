package com.Programs2;

public class Sample9 {
	int x = 5;
	{
		System.out.println("NSB :" + x);
		Sample s = new Sample();
	}
	Sample9() {
		System.out.println("NPC :" + x);
	}
	Sample9(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample9 s1 = new Sample9();
         Sample9 s2 = new Sample9(13);
         System.out.println("Main End");
         
	}
}

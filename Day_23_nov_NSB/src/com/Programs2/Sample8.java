package com.Programs2;

public class Sample8 {
	 int x = m1();
     Sample8 s = new Sample8();
	{
		System.out.println("NSB :" + x);
	}
	Sample8() {
		System.out.println("NPC :" + x);
	}
	Sample8(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	int m1() {
		System.out.println("NSM Executed");
		return 50;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample8 s1 = new Sample8();
         Sample8 s2 = new Sample8(13);
         System.out.println("Main End");
         
	}
}

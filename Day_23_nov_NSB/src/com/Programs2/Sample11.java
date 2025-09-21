package com.Programs2;

public class Sample11 {
	int x = 5;
	{
		System.out.println("NSB1 x :" + x);
	}
	Sample11() {
		System.out.println("NPC x:" + x);
	}
	Sample11(int x) {
		this.x = x;
		System.out.println("IPC x :" + x);
	}
	int y;
	{
		System.out.println("NSB2 x :"+x);
		System.out.println("NSB2 y :"+y);
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample11 s1 = new Sample11();
         Sample11 s2 = new Sample11(13);
         System.out.println("Main End");
         
	}
}

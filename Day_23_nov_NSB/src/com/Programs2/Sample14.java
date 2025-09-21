package com.Programs2;

public class Sample14 {
	int x = 5;
	{
		System.out.println("NSB1 x:" + x);
	}
	Sample14() {
		System.out.println("NPC x:" + x);
		System.out.println("NPC y:" + y);
	}
	Sample14(int x) {
		this.x = x;
		System.out.println("IPC x:" + x);
		System.out.println("IPC y:" + x);
	}
	int y = m1();
	{   
		System.out.println("NSB2 y:" + y);
	}
	int m1() {
		System.out.println("M1 executed...");
		return 50;
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample14 s1 = new Sample14();
         Sample14 s2 = new Sample14(13);
         System.out.println("Main End");
         
	}
}

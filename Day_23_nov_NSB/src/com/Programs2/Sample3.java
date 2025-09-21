package com.Programs2;

public class Sample3 {
	int x;  
	{
		System.out.println("NSB1 :"+x);  // 0
	}
	Sample3() {
		System.out.println("NPC :" + x);  //10
	}
	Sample3(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	{
		x = 10;
		System.out.println("NSB2 :" + x);  // 10
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample3 s1 = new Sample3();
         Sample3 s2 = new Sample3(13);
         System.out.println("Main End");
	}
}

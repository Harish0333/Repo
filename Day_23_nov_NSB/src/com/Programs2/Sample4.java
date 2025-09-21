package com.Programs2;

public class Sample4 
{
	int x = 5;

	{
		System.out.println("NSB :" + x); // 5
	}
	Sample4() {
		System.out.println("NPC :" + x); //5
	}
	Sample4(int x) {
		this.x = x;
		System.out.println("IPC :" + x); // 13
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample4 s1 = new Sample4();
         Sample4 s2 = new Sample4(13);
         System.out.println("Main End");
         
	}
}

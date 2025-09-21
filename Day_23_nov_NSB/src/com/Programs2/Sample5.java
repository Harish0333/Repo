package com.Programs2;

public class Sample5 
{
	int x = 5;
	{
		this.x = 10;
		System.out.println("NSB :" + x); //10
	}
	Sample5() {
		System.out.println("NPC :" + x); //10
	}
	Sample5(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample5 s1 = new Sample5();
         Sample5 s2 = new Sample5(13);
         System.out.println("Main End");
	}
}

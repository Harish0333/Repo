package com.Programs2;

public class Sample12 
{
	int x = 5;
	{
		System.out.println("NSB1 x:" + x);
		System.out.println("NSB1 y:" + y);
	}
	Sample12() {
		System.out.println("NPC :" + x);
	}
	Sample12(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	int y;
	{
		System.out.println("NSB2 y:"+y);
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample12 s1 = new Sample12();
         Sample12 s2 = new Sample12(13);
         System.out.println("Main End");
         
	}
}

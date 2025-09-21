package com.Programs2;

public class Sample10 
{
	int x = 5;
	{
		System.out.println("NSB :" + x);
	}
	Sample10() 
	{
		Sample10 s = new Sample10();
		System.out.println("NPC :" + x);
	}
	Sample10(int x) 
	{
		this.x = x;
		System.out.println("IPC :" + x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
         Sample10 s1 = new Sample10();
         Sample10 s2 = new Sample10(13);
         System.out.println("Main End");
	}
}

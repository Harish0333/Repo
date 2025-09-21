package com.Programs2;

public class Sample6 
{
	int x = 5;
	{
		int x = 10;
		System.out.println("NSB :" + x);  //10
	}
	Sample6() {
		System.out.println("NPC :" + x);   //5
	}
	Sample6(int x) {
		this.x = x;
		System.out.println("IPC :" + x);
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
         Sample6 s1 = new Sample6();
         Sample6 s2 = new Sample6(13);
         System.out.println("Main End");
         
	}}

package com.Programs2;

public class Sample 
{
		int x;
		Sample() 
		{
			System.out.println("NPC :" + x);
		}
		Sample(int x) {
			this.x = x;
			System.out.println("IPC :" + x);
		}

		{
			System.out.println("NSB :" + x);
		}
		public static void main(String[] args)
		{
			System.out.println("Main Start");
	         Sample s1 = new Sample();
	         Sample s2 = new Sample(13);
	         System.out.println("Main End");
	         
		}
}

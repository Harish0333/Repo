package com.task4;

import java.util.Scanner;

import com.task.Test;

public class Main {

	public static void main(String[] args) 
	{
		Test t1=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 1 from 1st programmer:");
		int f=sc.nextInt();
		System.out.println("Input 2 from 1st programmer:");
		int l=sc.nextInt();
		
		System.out.println("Input 1 from 2nd programmer:");
		int f2=sc.nextInt();
		System.out.println("Input 2 from 2nd programmer:");
		int l2=sc.nextInt();
		
			Thread th1=new Thread(t1)
					{
						@Override
						public void run()
						{							
							t1.Print(f,l);
						}
					};
			Thread th2=new Thread(t1)
					{
						@Override
						public void run()
						{
							t1.Print(f2,l2);
						}
					};		
					
			th1.start();
			th2.start();
			sc.close();

	}

}

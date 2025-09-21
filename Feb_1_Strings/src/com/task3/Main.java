package com.task3;

import java.util.Scanner;

import com.task.Test;

public class Main 
{

	public static void main(String[] args) 
	{
		Test t1=new Test();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 1 from 1st programmer:");
		System.out.println("Input 2 from 1st programmer:");
		int f=sc.nextInt();
		int l=sc.nextInt();

		
			Thread th1=new Thread(t1)
					{
						@Override
						public void run()
						{
							
							t1.Print(f,l);
						}
					};
			th1.start();
			
			sc.close();
	}
}

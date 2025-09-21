package com.task;
//Design a program that initializes an array and accesses an element at an index beyond its size. 
//Use a try-catch block to handle the resulting ArrayIndexOutOfBoundsException.
public class Sample2 
{
		public void checkException2()
		{
			try
			{
			int a[]=new int [5];
			a[10]=20;
			}
			catch (ArrayIndexOutOfBoundsException a)
			{
			System.out.println("Array Index Out Of Bounds");
			}
		}
		public static void main(String[] args) 
		{
			Sample2 D=new Sample2();
			D.checkException2();
		}
}

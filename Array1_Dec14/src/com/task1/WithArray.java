package com.task1;
/*Que-> Write a java program to prove that the array can store multiple value at a time?

Solution:
*/
import java.util.Scanner;
public class WithArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element you want to store");
		int size=sc.nextInt();
		int value[]=new int[size];
		char choice;
		int index=0;
		do 
		{
			System.out.println("Enter the element you want to store");
			value[index++]=sc.nextInt();
			System.out.println("Enter the choice if you want to store more elements:");
			System.out.println("For Yes Press y or Y");
			System.out.println("For No Press n or N");
			choice=sc.next().charAt(0);
		}
		while(choice=='y'||choice=='Y');
		for(int i=0;i<size;i++)
		{
			System.out.println(value[i]+"");
		}
		sc.close();
	}
}

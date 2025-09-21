package com.even.odd;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		System.out.println(EvenOrOdd.isEven(x));
	}

}

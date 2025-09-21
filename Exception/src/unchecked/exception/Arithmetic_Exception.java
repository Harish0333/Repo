package unchecked.exception;

import java.util.Scanner;

public class Arithmetic_Exception 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x :");
		int x = sc.nextInt();
		
		System.out.print("Enter the value of y :");
		int y = sc.nextInt();
		
		int result = x/y;  //if y is 0 then program will Halt here
		
		System.out.println("Result is :"+result);
		System.out.println("Main method ended");
		sc.close();
	}
}

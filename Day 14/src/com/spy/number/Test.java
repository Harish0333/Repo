package com.spy.number;
import java.util.Scanner;
/*Write a program to check accept a number and check whether it is a 'Spy Number' or not. 
(A number is spy if the sum of its digits equals the product of its digits.)
Example: Sample Input: 1124
Sum of the digits = 1 + 1 + 2 + 4 = 8
Product of the digits = 1*1*2*4 = 8
Explanation:
Create a BLC(Business Logic Class) class called Calculate which contains a static method checkSpyNum ()

Name of the Method 		:	checkSpyNum ()
Parameter of the Method		:	one parameter of type integer
Return type of the Method	:	void
Access modifier of the Method	:	public

Create another class Test in the same package which is ELC class (contains main method) to test the application. 
Don’t create the Object in the Test class, call the static method checkSpyNum ()
of Calculate class.

Note :- Both the classes must be declared with public access modifier*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		Calculate.checkSpyNum(x);
		
	}
}

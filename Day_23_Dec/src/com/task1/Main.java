package com.task1;
/*Program: 1
-----------
Create an interface AdvancedArithmetic  which contains a method signature as:-
public abstract int divisorSum(int n). 

Then write a class called MyCalculator which implements the interface  AdvancedArithmetic.
divisorSum function just takes an integer as input and return the sum of all its divisors. 
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input
6
Sample Output
12
Explanation
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
A class Testing is given to you with a main method. Use this class to test your solution's classes and methods.
*/
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("Divisor sum for " + n + ": " + myCalculator.divisorSum(n));
        sc.close();
	}
}

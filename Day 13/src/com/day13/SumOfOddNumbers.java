/*Write a program in Java to display the first n terms of odd natural number and their sum. 
Output:
Enter the value of 'n': 
The first 5 odd natural numbers are:
1 3 5 7 9 
The sum of the first 5 odd natural numbers is: 25 */
package com.day13;
import java.util.Scanner;
public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create scanner object
        // Prompt the user to enter the value of 'n'
        // Display the first 'n' odd natural numbers and calculate their sum
        // Display the sum
        // Close the scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of 'n':");
		int num=sc.nextInt();
		sc.close();
		System.out.println("The first "+num+" odd natural numbers are:");
		int oddSum = sumOfOdd(num);
		System.out.println("\nThe sum of the first " + num + " odd natural numbers: " + oddSum);
	}
		public static int sumOfOdd(int num)
		{
			int i=1, sum = 0;
			for(;i <= 2*num;i++)
			{
				if(i % 2 != 0)
				{
					sum = sum + i; 
					System.out.print(i+" ");
				}
			}
			return sum;
	}
}


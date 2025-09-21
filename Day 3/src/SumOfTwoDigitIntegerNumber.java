/*Write a Java program and compute the sum of a two-digit integer number
Output:
User provided two-digit Integer is 89
 First digit is 8
 Last digit is 9
 Sum of digits 17*/
import java.util.Scanner;
public class SumOfTwoDigitIntegerNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define variables
		//Calculate sum of 2 digits
		//Print Results
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the two  digit number:");
		int num=sc.nextInt();
		sc.close();
		int div=num/10;
		int mod=num%10;
		int sum=div+mod;
		System.out.println("First digit is :"+div);
		System.out.println("Last digit is :"+mod);
		System.out.println("Sum of digits :"+sum);
	}

}

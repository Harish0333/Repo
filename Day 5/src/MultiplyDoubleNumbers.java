/*
 * write a java program to covert string to double using parseDouble() and multiply
two Floating -point Numbers and display the result by taking input from the 
command line argument?*/
 //Find if args length is 2 or not. if not then display error message.
 // Parse the command line arguments to double or Float
 // Perform the multiplication
 // Display the result
import java.util.Scanner;
public class MultiplyDoubleNumbers 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fist string number :");
		String str1=sc.next();
		System.out.println("Enter Second string number :");
		String str2=sc.next();
		sc.close();
		
		double v1=Double.parseDouble(str1);
		double v2=Double.parseDouble(str2);
		System.out.println(args.length);
		double res=v1*v2;
		System.out.println("Multiplication result:"+v1+"*"+v2+"="+res);
		
	}
}

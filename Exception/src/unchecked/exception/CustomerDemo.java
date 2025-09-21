package unchecked.exception;

import java.util.Scanner;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Client, Welcome to my application");
		Scanner sc = new Scanner(System.in);
		 try
		   {			   
			   System.out.print("Please enter the value of x :");
			   int x = sc.nextInt();
			   
			   System.out.print("Please enter the value of y :");
			   int y = sc.nextInt();
			   
			   int result = x /y;  
			   System.out.println("Result is :"+result);   
		   }
		 catch(Exception e)
		 {
			 System.err.println("Don't put zero here");
		 }
		sc.close();
		System.out.println("Thank you 4 visiting my application");
	}
}

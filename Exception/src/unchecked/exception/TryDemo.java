package unchecked.exception;

import java.util.Scanner;

public class TryDemo {
	public static void main(String[] args) {
		   System.out.println("Main method started....");	
		   Scanner sc = new Scanner(System.in);	
		   
		   try
		   {			   
			   System.out.print("Enter the value of x :");
			   int x = sc.nextInt();
			   
			   System.out.print("Enter the value of y :");
			   int y = sc.nextInt();
			   
			   int result = x /y;  
			   
			   System.out.println("Result is :"+result);
			   System.out.println("End of try");
		   }
		   catch(Exception e) //e = new AE();
		   {
			   System.out.println("Inside catch");
			   System.err.println(e);
		   }
		   sc.close();
		   System.out.println("Main method ended....");
	}
}

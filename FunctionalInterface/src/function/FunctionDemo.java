package function;

import java.util.Scanner;

public class FunctionDemo 
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> Square=(x)->(x*x);
		System.out.println("Enter the sqaure of a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Square.apply(num));
		
		//length of name
		Function<String,Integer> length=(str)->str.length();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println(length.apply(name));
		
		//name starts with
		  Function<String,Boolean> fn = str -> str.startsWith("R");
		  System.out.println("Your Name starts with R ?"+fn.apply("Ravi"));

		sc.close();
	}

}

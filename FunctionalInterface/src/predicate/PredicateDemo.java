package predicate;

import java.util.Scanner;

public class PredicateDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Predicate<String> checkname=(str)->str.startsWith("R");
		System.out.println("Enter your name");
		String name=sc.next();
		boolean starts=checkname.test(name);
		System.out.println(starts);

		//Check the number is even odd
		Predicate<Integer> evenodd=(x)->x%2==0;
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		boolean result=evenodd.test(num);
		System.out.println(result);
		
		 Predicate<String> verifyName =  str -> str.equals("Ravi");
		 System.out.print("Enter your Name :");
		 String name2 = sc.next();
		 System.out.println("Are U Ravi ?"+verifyName.test(name2));

		sc.close();
	}
}

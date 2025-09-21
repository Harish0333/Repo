package string.literal;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
		System.out.print("Enter Country Name :");
		String name = sc.next();
		Predicate<String> p1 = str -> str.equals("India");
		System.out.println("Country Name is India ?:"+p1.test(name));
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
	}
}

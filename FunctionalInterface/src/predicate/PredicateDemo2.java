package predicate;

import java.util.Scanner;

public class PredicateDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		//Check the number is eligible for voting
		Predicate<Integer> eligible=(x)->x>18;
		System.out.println("Enter persons age :");
		int age=sc.nextInt();
		boolean result=eligible.test(age);
		System.out.println("Eligibility for voting :"+result);
		
		sc.close();
	}
}

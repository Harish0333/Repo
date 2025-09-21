package test.literal;

public class StackMemory 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started..");
        m1();
		System.out.println("Main method ended..");
	}
	public static void m1()
	{
		System.out.println("m1 method started..");
        m2();
		System.out.println("m1 method ended..");
	}
	public static void m2()
	{		
		int x = 100;
		System.out.println("I am m2 method!!!"+x);
	}
}
/*main method
m1 method
i am m2 method 100
m1 method ended
main method ended
*/
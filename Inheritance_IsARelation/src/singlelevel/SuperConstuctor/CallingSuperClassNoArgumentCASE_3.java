package singlelevel.SuperConstuctor;

class Parent
{
	public Parent()
	{
		super();
		System.out.println("No Argument of Parent class");
	}
	
	public Parent(int x)
	{
		this();
		System.out.println("Parameterized constructor of Parent class :"+x);
	}
}
class Child extends Parent
{
	public Child()
	{
		super(15);
		System.out.println("No Argumenet of Child class");
	}
}

public class CallingSuperClassNoArgumentCASE_3 
{
	public static void main(String[] args) 
	{
		new Child();
	}
}

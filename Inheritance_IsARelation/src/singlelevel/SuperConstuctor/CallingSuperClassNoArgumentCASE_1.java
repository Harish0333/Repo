package singlelevel.SuperConstuctor;

class Base
{
	public Base()
	{
		super();
		System.out.println("Base class No Argument constructor");
	}
}
class Derived extends Base
{
	public Derived()
	{
		super();
		System.out.println("Derived class No Argument constructor");
	}
}

public class CallingSuperClassNoArgumentCASE_1 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Derived d1 = new Derived();
		
	}
}

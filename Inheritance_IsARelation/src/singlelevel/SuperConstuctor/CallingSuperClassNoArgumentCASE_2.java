package singlelevel.SuperConstuctor;

class A
{
	A(String str)
	{
		super();
		System.out.println("My Institute Name is :"+str);
	}
}
class B extends A
{
	public B()
	{
		super("Nit");
		System.out.println("No Argument Constructor of B class");
	}
}

public class CallingSuperClassNoArgumentCASE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

}

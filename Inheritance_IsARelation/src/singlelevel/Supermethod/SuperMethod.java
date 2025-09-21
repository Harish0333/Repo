package singlelevel.Supermethod;

class Super
{
	public void show()
	{
		System.out.println("Super class Show method");
	}
}
class Sub extends Super
{
	public void show()
	{
		super.show();
		System.out.println("Sub class Show method");
	}
}

public class SuperMethod {

	public static void main(String[] args) 
	{
		new Sub().show();

	}

}

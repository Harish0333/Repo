package var.args;

public class Test1 {
	public void accept(int x, int... y) // valid
	{
		System.out.println("x value is :"+x);
		for (int z : y) 
		{
			System.out.println(z);
		}
	}

}

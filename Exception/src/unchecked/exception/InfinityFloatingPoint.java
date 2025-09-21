package unchecked.exception;

public class InfinityFloatingPoint 
{
	public static void main(String[] args) 
	{
			System.out.println("Main Started");
			System.out.println(10/0.0);//inifinity
			System.out.println(-10/0.0);//inifinity
			System.out.println(0/0.0);//undefined
			System.out.println(10/0);//inifinity
			System.out.println("Main Ended");
	}
}

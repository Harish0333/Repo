package unchecked.exception;

public class ExceptionSuper 
{
	public static void main(String[] args)
	{
		Exception e = new ArithmeticException("Divide by zero");
		System.out.println(e); //Fully Qualified name : error msg

		Exception e1 = new ArrayIndexOutOfBoundsException();
		System.out.println(e1);
		
		Exception e2 = new NullPointerException();
		System.out.println(e2);
	}
}

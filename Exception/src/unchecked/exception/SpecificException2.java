package unchecked.exception;

public class SpecificException2 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new OutOfMemoryError();
		}
		catch(Throwable e)
		{
			System.out.println("Inside catch block");
			System.err.println(e);
		}
	}
}

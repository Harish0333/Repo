package unchecked.exception;

public class SpecificException3 {

	public static void main(String[] args) {
		try
		{
			throw new OutOfMemoryError();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
			System.err.println(e);
		}

	}
}

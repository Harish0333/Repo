package unchecked.exception;

public class ThrowException {

	public static void main(String[] args) {
		System.out.println("Main method started");
		try
		{
			throw new ArithmeticException("Ravi is dividing by zero");
	
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		System.out.println("Main method ended");
	}

}

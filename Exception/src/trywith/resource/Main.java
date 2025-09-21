package trywith.resource;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		DatabaseResource dr = new DatabaseResource();
		FileResource fr = new FileResource();
		
		try(dr ; fr)
		{
		 System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.err.println("Don't provide zero");
		}
	}
}

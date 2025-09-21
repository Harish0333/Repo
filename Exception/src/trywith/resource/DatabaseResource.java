package trywith.resource;

public class DatabaseResource implements AutoCloseable
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("Database resource closed");		
	}
}

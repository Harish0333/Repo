package trywith.resource;

import java.io.Closeable;
import java.io.IOException;

public class FileResource implements Closeable 
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("File Resource closed");		
	}
}

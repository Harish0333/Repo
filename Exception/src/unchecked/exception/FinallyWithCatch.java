package unchecked.exception;

public class FinallyWithCatch 
{
	public static void main(String[] args) 
	{
		try
		{
		    int []x = new int[-2];	//We can't pass negative size of an array in negative
		    x[0] = 12;
		    x[1] = 15;
		    System.out.println(x[0]+" : "+x[1]);
		}
		catch(NegativeArraySizeException e)
		{		
			System.err.println("Array Size is in negative value...");
		}
		finally
		{
		   System.out.println("Resources will be handled here!!");		   
		}
		System.out.println("Main method ended!!!");
	}
}

package unchecked.exception;

public class MultyCatch1 
{
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!!");
		try
		{
		   String str1 = null;
		   System.out.println(str1.toUpperCase());
		   
		   String str2 = "Ravi";
		   int x = Integer.parseInt(str2);
		   System.out.println("Number is :"+x);
		}
		catch(NumberFormatException | NullPointerException  e)
		{
			e.printStackTrace();
		}

		System.out.println("Main method ended!!");
	}
}

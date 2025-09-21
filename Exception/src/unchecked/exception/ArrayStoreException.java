package unchecked.exception;

import java.util.Arrays;

public class ArrayStoreException 
{
	public static void main(String[] args) 
	{
		  Object obj[] = new String[3];
		  obj[0] = "Ravi";
		  obj[1] = "Raj";
		  obj[2] = 90;
		  System.out.println(Arrays.toString(obj));
	}
}

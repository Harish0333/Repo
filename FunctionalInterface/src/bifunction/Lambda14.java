package bifunction;

public class Lambda14 
{
	public static void main(String[] args) 
	{
        // BiFunction to concatenate two strings
		BiFunction<String, String, String> concatenateStrings = (str1, str2) -> str1 + str2;

        String result = concatenateStrings.apply("Hello", " Java");
        System.out.println(result);  
	}

}

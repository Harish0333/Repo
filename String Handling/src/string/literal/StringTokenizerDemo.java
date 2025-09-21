package string.literal;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{
	public static void main(String[] args) 
	{
		String str = "Hyderabad is a nice city";
		
		StringTokenizer st = new StringTokenizer(str, "e");
		
		System.out.println("Total number of Tokens :"+st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}

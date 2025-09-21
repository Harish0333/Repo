package test.literal;

public class Charr {

	public static void main(String[] args) {
		/*
		 * char ch1 = 'a'; System.out.println("ch1 value is :"+ch1);
		 * 
		 * char ch2 = 97; System.out.println("ch2 value is :"+ch2);
		 * 
		 * int ch = 'A'; System.out.println("ch value is :"+ch);
		 */

		/*
		 * char ch1 = 63; System.out.println("ch1 value is :"+ch1);
		 * 
		 * char ch2 = 64; System.out.println("ch2 value is :"+ch2);
		 * 
		 * char ch3 = '\u0061'; System.out.println("ch3 value is :"+ch3);
		 */

		/*
		 * char ch1 = 65535; System.out.println("ch1 value is :"+ch1);
		 * 
		 * char ch2 = 0Xadd; System.out.println("ch2 value is :"+ch2);
		 * 
		 * char ch ='\n'; System.out.println(ch);
		 */
		System.out.println(" Java Unicodes\n");

		for (int i = 31; i < 126; i++)
		{
			char ch = (char)i; // Convert unicode to character
			String str = i + "  "+ ch;
			System.out.print(str + "\t\t");
			if ((i % 5) == 0) // Set 5 numbers per row
			System.out.println( );
		}
	}

}

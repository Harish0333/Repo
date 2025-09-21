/*
 * write a java program to find the ASCII value of a character
For Example:

Output should be in below format
The ASCII value of a is :97*/
import java.util.Scanner;
public class  AsciiValue
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        int ascii = (int) ch;
        System.out.println("The ASCII value of the character " + ch + " is " + ascii);
	}

}

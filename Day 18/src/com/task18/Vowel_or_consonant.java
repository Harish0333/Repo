package com.task18;
import java.util.Scanner;
/*          
1) Write a program to check whether given character is consonant or vowel using switch case 
	and also display its UNICODE value.*/
public class Vowel_or_consonant 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		char x=sc.next().charAt(0);
		//x=Character.toLowerCase(x);
		sc.close();
		switch(Character.toLowerCase(x))
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
                System.out.println(x + " is a consonant.");
            } else {
                System.out.println(x + " is not a valid alphabet.");
            }
		}
		System.out.println("Unicode value: " + (int)x);
	}
}

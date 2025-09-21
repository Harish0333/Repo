package string.example;

import java.util.Scanner;

public class Reverse_StrBuilder 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		System.out.println(sb.reverse());
		sc.close();
	}

}

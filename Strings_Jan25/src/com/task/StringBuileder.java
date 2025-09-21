package com.task;

import java.util.Scanner;

public class StringBuileder {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse :");
		String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        System.out.println(sb.reverse());
        sc.close();
	}
}

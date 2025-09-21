package com.task;

import java.util.Scanner;

public class LexicographicComparison 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input first string
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();

	        // Input second string
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        // Compare the strings lexicographically
	        if (areLexicographicallyEqual(str1, str2)) {
	            System.out.println("The strings are lexicographically equal.");
	        } else {
	            System.out.println("The strings are not lexicographically equal.");
	        }

	        scanner.close();
	    }

	    // Function to check if two strings are lexicographically equal
	    private static boolean areLexicographicallyEqual(String str1, String str2) {
	        // Check if the lengths are equal
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Check character by character
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }

	        // If all characters are equal, return true
	        return true;
	    }
}

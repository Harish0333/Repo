package com.task;

import java.util.Scanner;

public class CharacterOccurrence 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Input the character to count
        System.out.print("Enter the character to count: ");
        char targetChar = scanner.next().charAt(0);

        // Count the occurrence of the character
        int occurrenceCount = countCharacterOccurrence(inputString, targetChar);

        System.out.println("The character '" + targetChar + "' occurs " + occurrenceCount + " times in the string.");

        scanner.close();
    }

    // Function to count the occurrence of a given character in a string
    private static int countCharacterOccurrence(String str, char targetChar) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }
}

package com.task;

public class Frequencies
{
    public static void main(String[] args) 
    {
        String input = "Hello Everyone";
        char [] c=input.toCharArray();
        for (char ch : c)
        {
            if (ch == ' ') 
            {
                System.out.println("The frequency of  is 1"); // For spaces
            } 
            else 
            {
                int frequency = countFrequency(input, ch);
                System.out.println("The frequency of " + ch + " is " + frequency);
            }
        }
    }
    
    public static int countFrequency(String input, char target) 
    {
        int frequency = 0;
        for (char ch : input.toCharArray()) 
        {
            if (ch == target)
            {
                frequency++;
            }
        }
        return frequency;
    }
}


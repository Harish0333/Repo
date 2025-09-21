package com.task;
import java.util.Scanner;
public class ReverseOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		char []ch=str.toCharArray();
		System.out.println("Result :");
		for(int i=str.length()-1;i>=0;i--)
		{
			int minIndex = i;
            for (int j = i + 1; j < ch.length; j++) 
            {
                if (ch[j] < ch[minIndex]) 
                {
                    minIndex = j;
                }
            }
            // Swap the characters
            char temp = ch[i];
            ch[i] = ch[minIndex];
            ch[minIndex] = temp;
		}
		for(char c:ch)
		{
			System.out.print(c);
		}
		sc.close();
	}
}

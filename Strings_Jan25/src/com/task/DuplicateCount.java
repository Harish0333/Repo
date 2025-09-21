package com.task;
import java.util.Scanner;
//Write a program to sort the String data.

//input :-aabbAa
//output:-Aaaabb


public class DuplicateCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
	    char[] carray = str.toCharArray();
	    System.out.println("The string is:" + str);
	    System.out.println("Duplicate Characters in above string are: ");
	    for (int i = 0; i < str.length(); i++)
	    {
	    	int count=1;
	    	for (int j = i + 1; j < str.length(); j++)
	    	{
	    		if (carray[i] == carray[j] && carray[i]!=' ')
	    		{
	               count++;
	               carray[j]='0';//marks 0 to avoid recounting
	            }
	         }
	         if(count>1 && carray[i]!='0')
	         {
        	   System.out.println(carray[i]+" Appears in "+count);
	         }		        
	    }
	    sc.close();
	}
}
package string.example;

import java.util.Scanner;

public class Duplicate_characters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a String :");
		  String str = sc.nextLine(); //ravishankar

		  int count = 0;
		  char[] arr = str.toCharArray();    

		  System.out.println("Duplicate Characters are:");

		  for (int i = 0; i < str.length(); i++)     //i=2 
		  {
		    for (int j = i + 1; j < str.length(); j++) //j=3
			{
		      if (arr[i] == arr[j])   //r == r
				  {
		             System.out.println(arr[j]);
		             count++;
		            // break;
		          }
		     }
		  }
		   System.out.println("Total duplicate characters are :"+count);
		   sc.close();
	}
	
		}

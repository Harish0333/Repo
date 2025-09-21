//import list of classes or packages
/*Define a method which returns true if the given three digit number is palindrome otherwise return false.
Write the method with the following specifications:
Name of method : isPalindrome()
   Modifiers : public, static
  return type : boolean
   Argument : one argument of type integer
This method accepts an integer value as argument and 
return true if the given number is palindrome, else retrun false.*/

import java.util.Scanner;
 class TestPalindrome{
	static boolean isPalindrome(int num) {
	// write a logic to find weather given number is palindrome or not
	int rem,rev=0,x=num;
	while(x!=0)
	{
		rem=x%10;
		rev=(rev*10)+rem;
		x=x/10;	
	}
	if(num == rev)
	{
		return true;	
	}
		return false; 	
	/*
		String numStr = Integer.toString(num);
        // Use two pointers approach to check if it's a palindrome
        int start = 0;
        int end = numStr.length() - 1;
        while (start < end) 
        {
            if (numStr.charAt(start) != numStr.charAt(end)) 
            {
                // Characters at the current positions don't match, not a palindrome
                return false;
            }
            // Move the pointers towards each other
            start++;
            end--;
		}	
        return true;
        */
}
}
public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize Scanner object and read the number from user
		// call method
		// print results
		//close scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		if(TestPalindrome.isPalindrome(num))
		{
			System.out.println(num+" "+"Number is palindrome");			
		}
		else
		{
			System.out.println(num+" "+"Number is not a palindrome");
		}
	
	}
}

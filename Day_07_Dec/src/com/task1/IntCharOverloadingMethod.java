package com.task1;
/*Create a class to print an integer and a character with two methods having the same name but different sequence 
  of the integer and the character parameters.

For example, if the parameters of the first method are of the form (int n, char c), 
then that of the second method will be of the form (char c, int n).
Expected Output:
int=66 char=A
int=67 char=D
*/
public class IntCharOverloadingMethod 
{
	public void met(int n, char c)
	{
		//write a method intChar(). parameters are int n, char c. and return type is void
		//inside the methods print values
		System.out.println("int=" + n + " char=" + c);
	}
	public void met(char c,int n)
	{
		//write a method intChar(). parameters are char c, int n. and return type is void
		//inside the methods print values
		System.out.println("int=" + n + " char=" + c);
	} 
	public static void main(String[] args) 
	{
		// careate an object to IntCharOverloadingMethod class
		//call intChar method twice by passing first 'A', 66 and next 67, 'D'
		new IntCharOverloadingMethod().met(66,'A');
		new IntCharOverloadingMethod().met('D',67);
	}
}

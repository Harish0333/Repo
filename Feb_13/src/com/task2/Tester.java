package com.task2;
/*Program: 2
----------------
Write a Java program to convert Array to List.
A BLC class called ArrayToList is given to you.
Add a static method: convertToList(String[] inputArray) : This method 
takes an array of strings as an argument. It should convert the given 
array to a list of Strings and return this list. 
Note that the length of the list must be the same as that of the array. 
Return null for errors a null array or an empty list for an empty 
array.
An ELC Class called Tester with the main method is given to you. Use 
this class to test your solution
*/
import java.util.List;

public class Tester 
{
	 public static void main(String[] args) 
	 {
		 String []input1= {"A","B","C"};
		 List<String> result=ArrayToList.convertToList(input1);
		 System.out.println("Arrays list :"+result);
		 
		 String []input2= {};
		 List<String> result2=ArrayToList.convertToList(input2);
		 System.out.println("Empty list :"+result2);
		 
		 String []input3= null;
		 List<String> result3=ArrayToList.convertToList(input3);
		 System.out.println("Null list :"+result3);
	 }
}

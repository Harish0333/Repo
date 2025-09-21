package com.task1;
/*Que-1) Given an array of integers, return true if 15 appears as either the first or last element in the array.
       The array will be length 1 or more.
*/
public class ArrayDemo1 
{
	public static void main(String[] args) 
	{
		int arr[]= {15,20,55,64,88};
		
		boolean b=firstlast(arr);
		
		System.out.println("15 is available in:"+b);

	}
	public static boolean firstlast(int num[])
	{
		if(num[0]==15 || num[num.length-1]==15)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

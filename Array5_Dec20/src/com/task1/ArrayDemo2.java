package com.task1;
/*Given an array of integers, return true if the array length is 1 or more,and the first element and the 
last elements both are equal.*/
public class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int arr[]= {15,20,55,64,15};
		
		boolean b=firstlast(arr);
		
		System.out.println("length is equal to 1 or more:"+b);

	}
	public static boolean firstlast(int num[])
	{
		if(num[num.length-1]>1 &&num[0]==15 && num[num.length-1]==15)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

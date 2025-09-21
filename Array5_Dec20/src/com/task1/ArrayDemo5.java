package com.task1;
/*Que-5)
----------------
Given an array of integers length 3, return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}.*/
import java.util.Arrays;
public class ArrayDemo5 
{
	public static  int[] rotate(int arr[]) 
	{
		int result[]=new int[arr.length];
		result[0]=arr[2];
		result[1]=arr[1];
		result[2]=arr[0];
		return result;
	}
	public static void main(String[] args) 
	{
	int arr[]= {1,2,3};
	 int result[]=ArrayDemo5.rotate(arr);
	 System.out.println("The original array "+Arrays.toString(arr));
	 System.out.println("The rotated array "+Arrays.toString(result));
	}
}

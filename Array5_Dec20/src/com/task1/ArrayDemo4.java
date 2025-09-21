package com.task1;
import java.util.*;
public class ArrayDemo4 
{
	public static  int[] rotate(int arr[]) 
	{
		int result[]=new int[arr.length];
		result[0]=arr[1];
		result[1]=arr[2];
		result[2]=arr[0];
		return result;
		 
	}
	public static void main(String[] args) 
	{
	 int arr[]= {1,2,3};
     int result[]=ArrayDemo4.rotate(arr);
	 System.out.println("The original array "+Arrays.toString(arr));
	 System.out.println("The rotated array "+Arrays.toString(result));
	}
}

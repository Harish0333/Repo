package com.task1;
/*1- Write a program in java to sort n numbers in the range from 0 to n^2.

The given array is: 37 62 52 7 48 3 15 61
Sorted array is: 3 7 15 37 48 52 61 62*/
public class Sort 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {37,62,52,7,48,3,15,61};  
		System.out.println("The given Array elements :");  
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println("\nThe Sorted Array elements :");  
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}   
			System.out.print(arr[i]+" ");  
		}  
	}  
}

package com.task1;

import java.util.Arrays;
/*Write the java program to print the array in descending order and print the 
array without using for loop?*/
public class DescendingOrder 
{
	public static void main(String[] args)
	{
		int arr[]= {2,5,9,7,1};
		int temp;
		System.out.println("Original Array :"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Result array :"+Arrays.toString(arr));
	}
}

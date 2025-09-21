package com.task1;

import java.util.Arrays;
/*Write a java program to sort the array in Ascending order 
and print the array without using for loop ?
	// sort the array ele in asc order
	/*    2,1,5,3,6
	 *    1 2 5 3 6
	 *    1 2 3 5 6
	 */
public class AscendingOrder 
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
				if(arr[i]>arr[j])
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

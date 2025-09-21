package com.task1;

import java.util.Arrays;

/*Write the java program to show Bubble sorting in java and print the 
sorted array without using for loop ?
*
* - Bubble sorting the sorting will go 
 *     in number of rounds 
 *     rounds is based on 
 *      element-1;
 *      
 *  -  if the first element is greater than 
 *     the alternate element at once swap.
 *     
 *  - alwys the sreaching will start from 0 index
 *     
 *       37 18 28 12 4
 *       
 *       Round 1                Round 3
 *        37 18 28 12 4        18 12 4 28 37
 *        18 37 28 12 4        12 18 4 28 37
 *        18 28 37 12 4        12 4 18 28 37
 *        18 28 12 37 4        12 4 18 28 37
 *        18 28 12 4 37        12 4 18 28 37
 *        
 *       Round 2                Round 4
 *       18 28 12 4 37          12 4 18 28 37
 *       18 28 12 4 37          4 12 18 28 37
 *       18 12 28 4 37          4 12 18 28 37
 *       18 12 4 28 37          4 12 18 28 37 
 *       18 12 4 28 37          4 12 18 28 37
 *       
 *       100 ele
 *       2 1 3 4 5---------------100
 *       1 2 3 4 5---------------100
 * 
 */
 public class BubbleSorting 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,35,46,91,28};
		int temp;
		System.out.println("Original Array :"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.println("Result Array :"+Arrays.toString(arr));
	}

}

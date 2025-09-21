package com.task;
import java.util.Arrays;
import java.util.*;
/*Given an integer array, return a new array with double the length where its 
last element is the same as the original array, and all the other elements are containing 0. 
The original array will be length 1 or more.
*/
public class ArrayDemo 
{
	   public static void main(String[] args)
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of elements");
		   int n=sc.nextInt();
		   int []x;
		   x=new int[n];
		  
		   for(int i=0;i<n;i++)
		   {
			   x[i]=sc.nextInt();		   
		   }
	       
		   int []y = makeLast(x);
	       System.out.println("Array is :"+Arrays.toString(y));
	       sc.close();
	   }
	   
	   public static int []makeLast (int[] nums)
	   {
		  int len = nums.length;//4
		  int arr[];
		  arr=new int[len*2];
		  arr[arr.length-1]=nums[len-1];
		  return arr;
	   }
}

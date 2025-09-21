package com.task1;
/*Given 2 arrays of integers, a and b, return true if they have the same first element or they have the 
same last element. Both arrays will be length 1 or more.
*/
public class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int arr1[]= {15,20,55,63,84};
		int arr2[]= {15,23,36,83,90};
		boolean c=commonfirstend(arr1,arr2);
		System.out.println("Same first or same last element availabe:"+c);
	}
	public static boolean commonfirstend(int a[],int b[])
	{
		if((a.length>0) && (b.length)>0)
		{
			return (a[a.length-1]==b[b.length-1]) || (a[0]==b[0]);
		}
		else
		{
			return false;
		}
	}
}

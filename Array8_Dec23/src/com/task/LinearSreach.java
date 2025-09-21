package com.task;
import java.util.Scanner;

public class LinearSreach 
{
	public static void main(String[]Args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int n=sc.nextInt();
				
		int arr[];
		arr=new int[n];
		System.out.println("Enter "+n+" the elements in the list:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search in the list:");
		int c=sc.nextInt();
		linearsearch(arr,c);
		sc.close();
	}
	
	public static void linearsearch(int arr[],int c)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
			{
				 System.out.println("The element is at index :"+i);
				 return;
			}
		}
	 System.out.println("Element not found"); 
	}
}

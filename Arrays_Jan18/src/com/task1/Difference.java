package com.task1;
import java.util.Scanner;

/*2-Write a program in java to find a pair with the given difference.

The given array is: 1 15 39 75 92
The given difference is: 53
The pair are: (39, 92)
*/
public class Difference 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the "+size+" Elements :");
		int arr[]=new int[size];
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The given difference is:");
		int diff=sc.nextInt();
		sc.close();
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  				  
				if (arr[i]+diff == arr[j])   
				{    
					System.out.println("The Pairs are :"+"("+arr[i]+","+arr[j]+")");    
				}
			}     
		}
		
	}
}

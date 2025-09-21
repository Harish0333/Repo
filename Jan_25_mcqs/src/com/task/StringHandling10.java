package com.task;

public class StringHandling10 
{
	public static void main(String[] args) 
	{
		String str = "0Naresh1IT1";
		String[] arr = str.split("\\d");
		for(String nit : arr)
			System.out.print(nit);
	}
}

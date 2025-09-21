package com.even.odd;

public class EvenOrOdd 
{
	static boolean isEven (int x) 
	{
		if(x%2!=0)
		{
			System.out.println("Odd");
			return false;
		}
		else {
			System.out.println("Even");
			return true;
		}
	}
}

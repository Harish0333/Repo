package com.spy.number;
public class Calculate {
	public static void checkSpyNum (int number)
	{
		int sum = 0;
        int product = 1;
        int temp = number;
        while (number > 0) 
        {
            int digit = number % 10;
            System.out.print(digit+"+");
            sum += digit;
            product*=digit;
            number /= 10;
        }
        System.out.println("="+sum);
        if (sum == product) 
        {
            System.out.println("Sum of the digits ="+sum);
            System.out.println("product of the digits ="+product);
        } else 
        {
            System.out.println(temp + " is not a Spy Number.");
        }
	}
}

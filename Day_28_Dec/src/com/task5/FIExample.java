package com.task5;

public class FIExample implements NIT 
{
	 public static void main(String[] args)
	 {
	     int a = 25;
	     int b = 5;
	     FIExample fun = new FIExample();
	     int add = fun.add(a,b);
	     int sub = fun.sub(a,b);
	     int mul = NIT.multiply(a,b);
	     int div = NIT.divide(a,b);
	     System.out.println(add+" "+sub+" "+mul+" "+div+" "+fun.square(6));
	} 
	@Override
	public int square(int x) 
	{
		return x*x;
	}

}

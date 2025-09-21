package com.task;
import java.lang.FunctionalInterface;
/*@FunctionalInterface 
interface Str
{
	String str(String str);
}

public class FunctionalInterfac 
{
	public static void main(String[] args) 
	{
		Str nit = str -> "Naresh"+str;
		System.out.println(nit.str("IT"));	
	}
}*/
interface NIT
{
	public void nit();
}

public class FunctionalInterfac
{
	public static void main(String[] args) {
		String str = "IT";
		NIT n = () -> 
		{
			System.out.println("Naresh" +str);
		};
		n.nit();
	}
}

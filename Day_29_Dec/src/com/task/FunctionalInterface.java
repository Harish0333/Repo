package com.task;
import java.lang.FunctionalInterface;
/*interface Drawable
{
   void draw();
}
public class FunctionalInterface {
	public static void main(String[] args) 
	{
	   Drawable d=() -> System.out.println("Drawing...");
		//() -> System.out.println("Drawing...");	
	   d.draw();
	}	
}*/
/*
public class FunctionalInterface {
	public static void main(String args[])
	{
		Function<Integer, Float> div = a -> a / 2.0f;
		System.out.println(div.apply(15));
	}
}
*/
/*
@FunctionalInterface
interface NITT
{
	void nit(String name);
}
public class FunctionalInterface
{
	public static void main(String[] args) {
		NITT nit = (String name) -> "";
		System.out.println(nit.nit("NARESHIT"));
		
	}
}
*/
/*
@FunctionalInterface
interface NITT
{
	String nit(String name);
}
public class FunctionalInterface
{
	public static void main(String[] args) {
		NITT nit = (String name) -> "Welcome to";
		System.out.println(nit.nit("NARESHIT"));
	}
}
*/
/*
@FunctionalInterface
interface NITT
{
	String str(String nit);
}
public class FunctionalInterface
{
	public static void main(String[] args) 
	{
		NITT nit = (String nit) -> nit +"";
	}
}*/
interface NITt
{
	String nit(String name);
}
public class FunctionalInterface
{
	public static void main(String[] args) {
		NITt nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));		
	}
}


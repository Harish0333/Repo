package com.task;
import java.lang.FunctionalInterface;
/*interface Course
{
	String courseName();
	String facultyName();
	String duration();
}
@FunctionalInterface
interface NIT //extends Course
{
	String nit(String courseName);
}
public class FunctionalInterfaceEx
{
	public static void main(String[] args) {
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}*/

/*
@FunctionalInterface
interface NIT 
{
	String nit(String courseName);
}
interface Course extends NIT
{
	String courseName();
	String facultyName();
	String duration();
}
public class FunctionalInterfaceEx
{
	public static void main(String[] args) 
	{
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}*/
@FunctionalInterface
interface Function <T,R>
{
	R apply(T x);
}
public class FunctionalInterfaceEx
{
  public static void main(String[] args)
  {
	  	Function<String, Boolean> fun = str -> str.startsWith("A");	
		System.out.println(fun.apply("Ankit"));
	}
}


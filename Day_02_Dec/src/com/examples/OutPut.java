package com.examples;
//Question 2
public class OutPut 
{
	public static void main(String[] args)
    {
        new Alpha();//Base 
        new Base();//BaseBase
    }
}
class Alpha extends Base
{
    Alpha()
    {
        System.out.print("Base");
    }
}
class Base
{  
    Base()
    {
        System.out.println("Base");
    }
}

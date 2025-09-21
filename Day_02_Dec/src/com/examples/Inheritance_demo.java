package com.examples;
class An
{
int i;
void display()
{
System.out.println(i);
}
}
class Bm extends An
{
int j;
void display()
{
System.out.println(j);
}
}
public class Inheritance_demo 
{
	public static void main(String[] args) 
	{
		Bm obj = new Bm();
		obj.i=1;
		obj.j=2;
		obj.display();
	}
}

package com.task1;
/*Create a BLC class called A
Instance variable
private int data = 15;

Create a no-argument constructor, where create the object for class B (Another BLC class) 
and call the non-static display method available in class B. 
Create an instance method show() in class A, which will print instance variable data.
*/
public class A 
{
	private int data = 15;

    public A() 
    {
        B bObj = new B(this);
        bObj.display();
    }
    public void show() 
    {
        System.out.println("Instance variable data in A = " + data);
    }
}

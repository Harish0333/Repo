package com.task1;
/*Create an another BLC class B
 Instance variable
 private A obj;

 Create a parameterized constructor which takes class A as a parameter to initialize the instance variable
 Create a display method inside class B which internally calling the show() method of class A*/
public class B 
{
	 private A obj;

	    public B(A Obj) 
	    {
	        this.obj = Obj;
	    }
	    public void display() 
	    {
	        obj.show();
	    }
}

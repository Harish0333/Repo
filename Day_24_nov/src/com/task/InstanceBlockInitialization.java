/*1) create a class called InstanceBlockInitialization.
2) declare private string strParttern;
3) create a no parameterized constructor .In this method just print instance variable.
4) create a instance block and initialize the instance variable like below pattern.

* * * * * 

* * * * 

* * * 

* * 

* 
5) in main method create an object to InstanceBlockInitialization class.
6) run the program*/
package com.task;

public class InstanceBlockInitialization 
{
	private String strParttern;
	public InstanceBlockInitialization()
	{
		System.out.println(strParttern);
	}
	{
		System.out.println("* * * * * \r\n"
				+ "\r\n"
				+ "* * * * \r\n"
				+ "\r\n"
				+ "* * * \r\n"
				+ "\r\n"
				+ "* * \r\n"
				+ "\r\n"
				+ "*");
	}
	public static void main(String[] args) 
	{
		InstanceBlockInitialization i=new InstanceBlockInitialization();
		
	}
}

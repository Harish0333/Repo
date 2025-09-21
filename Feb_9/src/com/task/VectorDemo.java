package com.task;

import java.util.*;

public class VectorDemo 
{
	@SuppressWarnings("removal")
	public static void main(String args[]){
		Vector obj = new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		
		System.out.println("Capacity : "+obj.capacity());
		System.out.println(obj.elementAt(1));
		}
}

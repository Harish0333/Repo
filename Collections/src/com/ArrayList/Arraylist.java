package com.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist
{
	public static void main(String[] args) 
	{		    
		ArrayList<String> city= new ArrayList<>();
		
		city.ensureCapacity(15); //resize the capacity of Arraylist	
		city.add("Hyderabad");
		city.add("Mumbai");
		city.add("Delhi"); 

		city.add("Kolkata");
		System.out.println("ArrayList: " + city);
	 }
}


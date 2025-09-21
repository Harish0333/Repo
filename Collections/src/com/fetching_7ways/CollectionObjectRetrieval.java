package com.fetching_7ways;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionObjectRetrieval 
{
  public static void main(String[] args) 
  {
	Vector<String> fruits = new Vector<>();
	fruits.add("Orange");
	fruits.add("Mango");
	fruits.add("Apple");
	fruits.add("Grapes");
	fruits.add("Kiwi");
	
	Collections.sort(fruits);
	//System.out.println(fruits);
	System.out.println("FETCHING THROUGH ENUMERATION INTERFACE :");
  	               
	Enumeration<String> ele = fruits.elements();
	
	while(ele.hasMoreElements())
	{
		System.out.println(ele.nextElement());
	}
	
	System.out.println("FETCHING THROUGH ORDINARY FOR LOOP :");
	
	for(int i=0; i<fruits.size(); i++)
	{
		System.out.println(fruits.get(i));
	}
	
	System.out.println("FETCHING THROUGH FOR EACH LOOP :");
	
	for(String fruit : fruits)
	{
		System.out.println(fruit);
	}
	
	System.out.println("FETCHING THROUGH ITERATOR INTERFACE :");
	                      
    Iterator<String> itr = fruits.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
	
    
    System.out.println("FETCHING THROUGH LISTITERATOR INTERFACE :");
    ListIterator<String> ltr = fruits.listIterator();
    
    System.out.println("FETCHING THE DATA IN FORWARD DIRECTION");
    while(ltr.hasNext())
    {
    	System.out.println(ltr.next());
    }
    
    System.out.println("FETCHING THE DATA IN BACKWARD DIRECTION");
    
    while(ltr.hasPrevious())
    {
    	System.out.println(ltr.previous());
    }
    
   System.out.println("FETCHING THE ELEMENTS THROUGH FOR EACH METHOD");
   fruits.forEach(fruit -> System.out.println(fruit));
   
   System.out.println("FETCHING THE ELEMENTS THROUGH METHOD REFERENCE");
   fruits.forEach(System.out::println);
  
  }
}

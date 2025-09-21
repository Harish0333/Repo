package com.fetching_7ways;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalWorking {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");
		
		Consumer<String> cons = new Consumer<String>() 
		{
			@Override
			public void accept(String t) 
			{
				System.out.println(t.toUpperCase());
				
			}
		};
		
		fruits.forEach(cons);
		
		fruits.forEach(t-> System.out.println(t.toUpperCase()));
		
		//new Thread(()-> 
		System.out.println(Thread.currentThread().getName());
		
	}
}

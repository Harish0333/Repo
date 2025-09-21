package com.task;

import java.util.TreeSet;

public class CollectionExample13 
{
	public static void main(String[] args) 
	{
		TreeSet tree = new TreeSet();
		tree.add("nit");
		tree.add("Technology");
		tree.add("Naresh");
		System.out.println(tree.descendingSet());
	}
}

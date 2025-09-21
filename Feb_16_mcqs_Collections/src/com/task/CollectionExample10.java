package com.task;

import java.util.*;

public class CollectionExample10 
{
	public static void main(String[] args) 
	{
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("it");
		tree.add("Naresh");
		tree.add("tree");
		//tree.add(25);
		System.out.println(tree.tailSet("a"));
	}
}

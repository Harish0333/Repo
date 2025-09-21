package com.task;

import java.util.TreeSet;

public class CollectionExample11 
{
	public static void main(String[] args) {
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add("Technology");
		System.out.println(tree.tailSet("a"));
	}
}

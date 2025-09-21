package com.task;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample4 {

	public static void main(String[] args) 
	{
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");
		for(int i=2;i<tree.size();i++)
		{
			System.out.print(tree.remove(i));
		}

	}

}

package com.task;

import java.util.Set;
import java.util.TreeSet;

public class CollectionExample5 
{	
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");		
		for(String str: tree) 
		{
			if(tree.contains("Naresh"))
				System.out.print(str+" ");
		}
	}
}

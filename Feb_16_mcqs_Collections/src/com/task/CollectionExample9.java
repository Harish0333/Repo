package com.task;

import java.util.HashSet;

public class CollectionExample9 
{
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add(new StringBuffer("nit"));
		set.add(new StringBuffer("nit"));
		System.out.println(set);
		System.out.println(set.size());
	}
}

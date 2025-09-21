package com.task;

import java.util.HashSet;

public class CollectionExample8 
{
	public static void main(String[] args) 
	{
		HashSet hash = new HashSet<>();
		hash.add("nit");
		hash.add("nit");
		//hash.add("NIT");
		System.out.println(hash);
		System.out.println(hash.size());
	}
}

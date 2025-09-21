package com.task;

import java.util.*;

public class CollectionExample {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");

	}

}

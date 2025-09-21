package com.task;

import java.util.ArrayList;
import java.util.Collections;

public class ProductComparable {

	public static void main(String[] args) 
	{
		ArrayList<Product> a1=new ArrayList<>();
		a1.add(new Product(3, "Camera", 12890.90));
		a1.add(new Product(1, "Laptop", 85890.90));
		a1.add(new Product(2, "Mobile", 43890.90));
		
		a1.forEach(System.out::println);
		Collections.sort(a1);
		System.out.println("After Sorting based on the Number ");
		a1.forEach(System.out::println);
	}
}

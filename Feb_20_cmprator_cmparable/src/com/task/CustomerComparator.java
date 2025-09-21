package com.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class CustomerComparator
{

	public static void main(String[] args) 
	{
		ArrayList<Customer> a1=new ArrayList<>();
		a1.add(new Customer(123,"Harish",2000.82));
		a1.add(new Customer(126,"Hari",2000.82));
		a1.add(new Customer(129,"isha",2000.82));
		
		Comparator<Customer> Cid=
		{
			@Override 
			public int compare(Customer c1, Customer c2) 
			{
				return c1.getCustomerNumber()-c2.getCustomerNumber();
			}
		}
		Collections.sort(al, Cid);
		System.out.println("Sorting based on the ID");
		al.forEach(System.out::println);

		Comparator<Customer> Cname=(c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName());
		Collections.sort(al, Cname);
		System.out.println("Sorting based on the Name");
		al.forEach(System.out::println);

		
	}
}

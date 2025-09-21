package com.task;

import java.util.ArrayList;

public class CollectionExample7 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("google");
		al.add("Naresh");
		al.add("Information");
		al.add("Technology");
		for(int i=0;i<al.size();i++) 
		{
			System.out.println(al.get(i).substring(0,5));
		}
	}
}

package com.task;

import java.util.Set;
import java.util.TreeSet;

public class Test
{
	public static void main(String[] a) 
    {
         Set<Apple> set = new TreeSet<Apple>();
         set.add(new Apple());
         set.add(new Apple());
         set.add(new Apple());
         System.out.println(set);
    }
}
class Apple 
{

}
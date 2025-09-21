package com.task;

import java.util.*;

public class Test15 
{
	public static void main(String[] args) 
    {
         List<Number> list = new ArrayList<Number>();
         list.add(7);
         list.add(8);
         list.add(7);
         Number index = list.get(Integer.valueOf(7));
         System.out.println(index);
     }
}

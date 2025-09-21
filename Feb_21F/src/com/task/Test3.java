package com.task;

import java.util.TreeSet;
import java.util.Iterator;

public class Test3 
{
	 public static void main(String[] argv) 
     {
          TreeSet set = new TreeSet();
          for (int i = 0; i < 5; i++)
               set.add(Math.random());

          Iterator iter = set.iterator();
          while (iter.hasNext())
          {
              System.out.println(iter.next());  
          }
    }
}

package com.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
	    WeakHashMap<Test,String> map = new WeakHashMap<>();

			Test  t  = new Test();
			map.put(t," Rahul "); 

			System.out.println(map); //{Test Nit = Rahul}
			
			t = null;
			
			System.gc();	//Explicitly calling garbage collector 
			
			Thread.sleep(5000); 
			
			System.out.println(map); //{}
	}

}

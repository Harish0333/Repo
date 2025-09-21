package nit.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String... a)
	{
		ArrayList<String> arl = new ArrayList<>();//Generic type		
		arl.add("Apple");   
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");
		
		Collections.sort(arl);

		arl.forEach(System.out::println);
			
	}

}

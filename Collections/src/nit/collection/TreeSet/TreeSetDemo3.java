package nit.collection.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) 
	{
		Set<Character> t = new TreeSet<>();  
		t.add('A'); 
		t.add('C');
		t.add('B');
		t.add('E');
		t.add('D');	
		Iterator<Character> iterator = t.iterator();
		iterator.forEachRemaining(x -> System.out.println(x)); 

	}

}

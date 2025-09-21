package nit.collection.TreeSet;

import java.util.TreeSet;

public class DescendingInteger {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student(1,"Z"));
		ts.add(new Student(3,"A"));
		ts.add(new Student(2,"B"));
		
		System.out.println(ts);

	}

}

package nit.collection.TreeSet;

import java.util.TreeSet;

public class TreeSetConstructor {

	public static void main(String[] args) {
		TreeSet<Employee> ts1 = new TreeSet<>((e1, e2)-> e1.id()-e2.id());
		ts1.add(new Employee(333, "A"));
		ts1.add(new Employee(111, "Z"));
		ts1.add(new Employee(222, "R"));
		
		System.out.println("Employee Sorted based on ID :");
		ts1.forEach(System.out::println);
		
		TreeSet<Employee> ts2 = new TreeSet<>((e1, e2)-> -(e1.id()-e2.id()));
		ts2.add(new Employee(333, "A"));
		ts2.add(new Employee(111, "Z"));
		ts2.add(new Employee(222, "R"));
		
		System.out.println("Employee Sorted based on ID In Descending Order :");
		ts2.forEach(System.out::println);
		
		TreeSet<Employee> ts3 = new TreeSet<>((e1, e2)-> e1.name().compareTo(e2.name()));
		ts3.add(new Employee(333, "A"));
		ts3.add(new Employee(111, "Z"));
		ts3.add(new Employee(222, "R"));
		
		System.out.println("Employee Sorted based on Name :");
		ts3.forEach(System.out::println);
		
		TreeSet<Employee> ts4 = new TreeSet<>((e1, e2)-> - e1.name().compareTo(e2.name()));
		ts4.add(new Employee(333, "A"));
		ts4.add(new Employee(111, "Z"));
		ts4.add(new Employee(222, "R"));
		
		System.out.println("Employee Sorted based on Name Descending order :");
		ts4.forEach(System.out::println);

	}

}

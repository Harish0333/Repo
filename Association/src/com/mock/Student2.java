package com.mock;

public class Student2 {
	private String name;
	private int id;
	private Address add;// HAS-A(Aggregation)

	public Student2(String name, int id, Address add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void driving(Bike b) {//USES - A
		System.out.println("Ameerpet to hitech city  travelling  in :" + b.getModel());
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
}

package com.task2;
/*Create a Java class named School with following attributes:

private String name
private String location 
private Student students and
private Principal principal

Implement a parameterized constructor to initialize all the instance variable of School class.
Implement a copy constructor for School class that takes a School object and initialize
all the instance variable of new School object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the School class, create a method named addStudent(Student student) that adds a new Student object to the students .*/
public class School 
{
	private String name;
	private String location; 
	private Student students;
	private Principal principal;
	
	public School(String name, String location, Student students, Principal principal) 
	{
		super();
		this.name = name;
		this.location = location;
		this.students = students;
		this.principal = principal;
	}
	public School(School otherSchool) 
	{
		super();
		this.name = otherSchool.name;
		this.location = otherSchool.location;
		this.students = otherSchool.students;
		this.principal = otherSchool.principal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public void addStudent(Student student)
	{
		this.students=student;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", location=" + location + ", students=" + students + ", principal=" + principal
				+ "]";
	}
	
}

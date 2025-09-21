package com.task2;
/*Create a Student class and this class should have following attributes: 

private String name, 
private int age, 
private double GPA and a 
private Teacher object named teacher.

Implement a parameterized constructor to initialize all the instance variable of Student class.
Take a pair of setter and getter method for all the instance variables.
In the Student class, create a method named changeTeacher(Teacher newTeacher) that changes the teacher of the student
to the specified teacher.*/
public class Student 
{
	private String name;
	private int age;
	private double GPA;
	private Teacher teacher;
	
	public Student(String name, int age, double gPA, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		GPA = gPA;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void changeTeacher(Teacher newTeacher)
	{
		this.teacher=newTeacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", GPA=" + GPA + ", teacher=" + teacher + "]";
	}
	
}

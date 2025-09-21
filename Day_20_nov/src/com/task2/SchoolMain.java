package com.task2;
/*Create a Java class named School with following attributes:

private String name
private String location 
private Student students and
private Principal principal

Implement a parameterised constructor to initialise all the instance variable of School class.
Implement a copy constructor for School class that takes a School object and initialize
all the instance variable of new School object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the School class, create a method named addStudent(Student student) that adds a new Student object to the students .

Create a Student class and this class should have following attributes: 

private String name, 
private int age, 
private double GPA and a 
private Teacher object named teacher.

Implement a parameterised constructor to initialise all the instance variable of Student class.
Take a pair of setter and getter method for all the instance variables.
In the Student class, create a method named changeTeacher(Teacher newTeacher) that changes the teacher of the student
to the specified teacher.

Create a Teacher class and this class should have following attributes:

private String name and 
private String subject. 

Implement a parameterized constructor to initialize all the instance variable of Teacher class.
Take a pair of setter and getter method for all the instance variables.

Create a Principal class this class should have following attributes:
private String name and 
private int yearsExperience.

Implement a parameterized constructor to initialize all the instance variable of Principal class.
Take a pair of setter and getter method for all the instance variables.

Create a Main class that create a School object and sets its attributes and the attributes of its students, teacher, and principal. 
Then, create a copy of the School object using the copy constructor and print the attributes of both the original and 
the copy of the School objects to confirm that the copy constructor works correctly. 

Finally, use the addStudent() method to add a new student to the original School object and use the changeTeacher() method 
to change the teacher of one of the original School object's students. Print the attributes of both the original and 
the copy of the School objects again to confirm that the copy constructor created a deep copy of the Student, Teacher, 
and Principal objects and that the addStudent() and changeTeacher() methods did not affect the students or 
teachers of the copy of the School object.*/
public class SchoolMain 
{
	public static void main(String[] args) 
	{
		Principal originalPrincipal=new Principal("Praveen",12);
		Teacher originalTeacher=new Teacher("Ravi","Java");
		Student originalStudent=new Student("Harish",23,9.1, originalTeacher);
		School originalSchool=new School("Naresh IT", "Ameerpeta City Center", originalStudent, originalPrincipal);
		School copySchool=new School(originalSchool);
	
		System.out.println("Before adding new student and teacher:");
		System.out.println(originalSchool);
		System.out.println(copySchool);
		
		Student newStudent=new Student("Ramu",22,9.3,new Teacher("Sudhakar","ORACLE"));
		originalSchool.addStudent(newStudent);
		originalStudent.changeTeacher(new Teacher("Keshore","C programming"));
		
		System.out.println("After adding new student and teacher:");
		System.out.println(originalSchool);
		System.out.println(copySchool);
	}
}

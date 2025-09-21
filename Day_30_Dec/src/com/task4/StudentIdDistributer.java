package com.task4;
/*Scenario: You are developing a student management system for a school. Each student has a unique ID, name, and grade. 
 * You want to implement a feature that automatically generates a unique student ID for each new student enrolled.

Question: Implement a Supplier interface that generates a unique student ID for each new student. 
Each student ID should consist of a combination of alphanumeric characters.

Hint: You can use a combination of a random string and Math.random() to generate unique student IDs.

Requirements : 
-----------------
Class Name : Student
atributes  : private String name, private String id, private char grade;
Constructor: parameterized constructor to initialize Student class fields.
methods    : setter & getter for each fields , toString().

Class Name : StudentIdDistributer
//Implement a Supplier interface to genetate alphanumeric characters id in String.
String get();

Print the student details.*/
interface Supplier<T>
{
	T get();
}
public class StudentIdDistributer 
{
	 private static final Supplier<String> idGenerator = () -> 
	 {
	        // Generate a random alphanumeric string of length 8
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder idBuilder = new StringBuilder();
	        for (int i = 0; i < 8; i++) 
	        {
	            int index = (int) (Math.random() * characters.length());
	            idBuilder.append(characters.charAt(index));
	        }
	        return idBuilder.toString();
	 };
	 public static String generateId() 
     {
         return idGenerator.get();
     }
	 public static void main(String[] args) 
	 {
		 // Example usage
	        Student student = new Student("Ram","12",'O');
	        student.setId(generateId());
	        System.out.println("Student Details: " + student);
	  }
}

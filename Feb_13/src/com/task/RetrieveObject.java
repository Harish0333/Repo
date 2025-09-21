package com.task;
/* Program: 1
----------------
Write a Program in Java to Perform Serialization and De-serialization
operation on ArrayList Object.
Take a BLC class Student
Instance variables
studentId – private – Integer
studentName – private – String
studentFees – private – Double
dateOfAdmission – private – Date
Take a parameterized constructor to initialize the instance variables
Take a Method getStudentObject()
Method Name - getStudentObject()
Parameter - No Parameter
Access Modifier - public and static
Return type - Student
This method should take the Student data from client, create and 
return Student object from this method.

Override toString() method to print Student class properties or 
variables.
Take an ELC class StoreObject
Inside the main method create a for loop which will read the Student 
object with user choice and Store the Student object to a file called 
Student.txt
Take another ELC class RetrieveObject
This class will retrieve the Student Object from file and print the 
Student information data.
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveObject 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
        ArrayList<Student> students;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\\\Users\\\\Harish\\\\eclipse-workspace\\\\Feb_13\\\\Student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            students = (ArrayList<Student>) in.readObject();
            in.close();
            fileIn.close();
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
            return;
        }

        for (Student student : students) 
        {
            System.out.println(student);
        }
	}
}

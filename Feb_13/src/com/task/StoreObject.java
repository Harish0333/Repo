package com.task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreObject {

	public static void main(String[] args) throws IOException
	{
		ArrayList<Student> stud=new ArrayList<>();
		
		for(int i=0;i<3;i++)
		{
			stud.add(Student.getStudentObject());
		}
		var foos=new FileOutputStream("C:\\Users\\Harish\\eclipse-workspace\\Feb_13\\Student.txt");
		@SuppressWarnings("resource")
		var oos=new ObjectOutputStream(foos);
		try
		{
			oos.writeObject(stud);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

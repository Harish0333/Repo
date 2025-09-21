package com.student.data;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The student details are:");
		int roll=100;
		String name="Ravi";
		double fees=14000.9d;
		String studentDetails = Student.getStudentDetails(roll, name, fees);
		System.out.println(studentDetails);
	}

}

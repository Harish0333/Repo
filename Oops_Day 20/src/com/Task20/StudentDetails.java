package com.Task20;
/*A BLC (Business Logic Class) called Student is given to you.
 Instance Variables:
 studentId :private-int
 studentName : private-String
 marks: private-int
 grade: private-char
 method : calculateGrade():public:void
 Create a method public void setStudentData() with the parameters: studentId, studentName, marks.
 Note that grade is not set through method because it is a calculated value.
 Methods :
 displayDetails(): This method should return a String with the details of the student in the following format:
 Student [name=John Smith, studentId=123, marks=95, grade=A]
 calculateGrade(): This is a public method that calculates the grade based on the marks that is set.
 If marks is above 90, grade is set to A.
 If marks is between 81 and 90, grade is set to B,
 if marks is between 71 and 80, grade is set to C,
 if marks is between 61 and 70, grade is set to D,
 if marks is less than 61, grade is set to E.
 Use this method when you need to set or reset grade.
 An ELC(Executable Logic class) Tester with main method is given to you to test your code.*/
class Student{
    
    //class variables
	//set class variables studentId, studentName and marks
	private int studentId;
	private String studentName;
	private int marks;
	private char grade;
	public void setStudentData(int Id, String name,int smarks) 
	{
		studentId=Id;
		studentName=name;
		marks=smarks;
	}
	@Override
	public String toString() 
	{
		return "Student details \nstudentId=" + studentId + ", \nstudentName=" + studentName + ", \nmarks=" + marks + ", \ngrade="
				+ grade + ".";
	}


	//set class variable grade value using conditions 
	public void calculateGrade() 
	{
		if(marks>=90)
			grade='A';
		else if(marks>=80)
			grade='B';
		else if(marks>=70)
			grade='c';
		else if(marks>=60)
			grade='D';
		else
			grade='E';
	}
	
	//display student details as per the format provided in question
	/*public String displayDetails() {
		String studentDetails ="";
		return studentDetails;
	}*/
}
public class StudentDetails 
{
	public static void main(String[] args) 
	{
			//create object to Student class
			//call setStudentData method by passing studentId, name and marks
			//call calculateGrade method to calculate grade
			//call displayDetails method to print student details in given format
		Student s1=new Student();
		s1.setStudentData(101,"Harish",85);
		s1.calculateGrade();
		System.out.println(s1);
	}

}

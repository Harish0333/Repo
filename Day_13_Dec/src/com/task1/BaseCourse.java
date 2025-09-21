package com.task1;

public class BaseCourse 
{
	int numStudents;
	String faculty;
	String baseCourse;
	String courseCost;
	
	public BaseCourse(int numStudents, String faculty, String baseCourse, String courseCost) {
		super();
		this.numStudents = numStudents;
		this.faculty = faculty;
		this.baseCourse = baseCourse;
		this.courseCost = courseCost;
	}

	public void displayCourseDetails()
	{
		System.out.println("Course num  Students=" + numStudents + ", faculty=" + faculty + ", baseCourse=" + baseCourse); 
	}
	
	public void getCourseCost()
	{
		System.out.println("Base courseCost=" + courseCost);
	}

}

package com.task1;

public class JavaCourse extends BaseCourse
{
	String mainCourse;
	String mainCourseCost;
	
	public JavaCourse(int numStudents, String faculty, String baseCourse, String courseCost, String mainCourse,String mainCourseCost) 
	{
		super(numStudents, faculty, baseCourse, courseCost);
		this.mainCourse = mainCourse;
		this.mainCourseCost = mainCourseCost;
	}
	
	@Override
	public void displayCourseDetails()
	{
		System.out.println("Course numStudents=" + numStudents + ", faculty=" + faculty + ", baseCourse=" + baseCourse); 
	}
	@Override
	public void getCourseCost()
	{
		double TotalCost=Double.parseDouble(courseCost)+Double.parseDouble(mainCourseCost);
		System.out.println("Base courseCost=" + courseCost+" + Main Course Cost="+mainCourseCost);
		System.out.println("Total cost="+TotalCost);
	}
	
}

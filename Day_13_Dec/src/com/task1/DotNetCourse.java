package com.task1;

public class DotNetCourse extends BaseCourse 
{
	String mainCourse;
	String mainCourseCost;
	
	public DotNetCourse(int numStudents, String faculty, String baseCourse, String courseCost, String mainCourse,String mainCourseCost)
	{
		super(numStudents, faculty, baseCourse, courseCost);
		this.mainCourse = mainCourse;
		this.mainCourseCost = mainCourseCost;
	}
	
	@Override
	public void displayCourseDetails()
	{
		System.out.println("BaseCourse numStudents=" + numStudents + ", faculty=" + faculty + ", baseCourse=" + baseCourse+"main course="+mainCourse); 
	}
	@Override
	public void getCourseCost()
	{
		double TotalCost=Double.parseDouble(courseCost)+Double.parseDouble(mainCourseCost);
		System.out.println("Base courseCost=" + courseCost+" + Main Course Cost="+mainCourseCost);
		System.out.println("Total cost="+TotalCost);
	}
}

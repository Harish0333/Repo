package com.task1;
/* create a class called BaseCourse

instance variables

int numStudents
String faculty
String baseCourse
String courseCost

create a parameterised constructor to initialise instance variables with numStudent to 100, faculty to Srinivas, baseCourse to C and courseCost to 5000

create an instance method displayCourseDetails() method which should display instance variables.

create an instance method getCourseCost() method which should display cost of the course

2) Create a class JavaCourse. which is a sub class of BaseCourse.

instance variable
String mainCourse
String mainCourseCost

create a parameterised constructor to initialise super class's instance variables (numStudent to 150, faculty to Ravi Shankar, baseCourse to C and courseCost to 5000), mainCourse to Java and mainCourseCost to 15000

override displayCourseDetails() method. this method should  print both super class and sub class instance variables

override getCourseCost() method. this method should display totalCost (mainCourseCost + baseCourseCost);

3) create a class DotNetCourse. which is a sub class of BaseCourse.

instance variable
String mainCourse
String mainCourseCost

create a parameterised constructor to initialise super class's instance variables (numStudent to 80, faculty to Ramesh, baseCourse to C and courseCost to 5000), mainCourse to DotNet and mainCourseCost to 10000


override displayCourseDetails() method. this method should  print both super class and sub class instance variables

override getCourseCost() method. this method should display totalCost (mainCourseCost + baseCourseCost);

4) create a MainCourse class which will contain main method to test our code.
	
create  BaseCourse, JavaCourse and DotNetCourse objects and call displayCourseDetails and getCourseCost methods.*/
public class MainCourse {

	public static void main(String[] args) 
	{
		BaseCourse b1= new BaseCourse(100, "Srinivas", "C", "5000");
		b1.displayCourseDetails();
		b1.getCourseCost();
		System.out.println("----------------------------------------------------");
		JavaCourse j1=new JavaCourse(150,"Ravi Shankar","C","5000","Java","15000");
		j1.displayCourseDetails();
		j1.getCourseCost();
		System.out.println("----------------------------------------------------");
		DotNetCourse d1=new DotNetCourse(80,"Ramesh","C","5000","DotNet","10000");
		d1.displayCourseDetails();
		d1.getCourseCost();
	}

}

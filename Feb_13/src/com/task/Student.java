package com.task;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("serial")
public class Student implements Serializable
{
	private Integer studentId ;
	private String studentName ;
	private Double studentFees ;
	private Date dateOfAdmission ;
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject()
	{
		return new Student(101, "John Doe", 2500.0, new Date());
		
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
}

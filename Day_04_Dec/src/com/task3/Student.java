package com.task3;

public class Student 
{
	protected int studentId ; 
	protected String name; 
	protected double examFee;
	
	public double payFee(double amount)
	{
		double Amount = examFee - amount;
        return Amount;
	}
	
	public Student(int studentId, String name, double examFee) 
	{
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
}

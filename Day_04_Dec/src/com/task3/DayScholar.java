package com.task3;

public class DayScholar extends Student 
{
	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) 
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	
	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
}

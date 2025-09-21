package com.task;
/**1) Write a program to create user-defined un-checked exception which will accept an aadhar Number from the user String, 
 * if the aadhar Number length is not equal to 12 then throw the user-defined exception that is InvalidAadharException with proper message./
 */
@SuppressWarnings("serial")
public class InvalidAadharException extends RuntimeException
{
	public InvalidAadharException(String Msg)
	{
		super(Msg);
	}
}

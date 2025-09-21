package com.task;

public class EnumTest {

	public static void main(String[] args) 
	{
		Designation designation = Designation.Manager;
		switch (designation) {
		case Developer:
			System.out.println("Developer");
			break;
		case Tester:
			System.out.println("Tester");
			break;
		case Manager:
			System.out.println("Manager");
			break;
		case TEAM_LEADER:
			System.out.println("TEAM_LEADER");
			break;
		default:
			break;
		}
	}

}

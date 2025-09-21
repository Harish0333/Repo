package association.weakRefer;

import java.util.Scanner;

public class Trainer {
	   public static void viewStudentProfile(Student student)
	   {
		   Scanner sc = new Scanner(System.in);	   
		   System.out.print("Enter the Student Id :");
		   int id = sc.nextInt();  //111
		   
		   if(id == student.getStudentId())
		   {
			   System.out.println(student);
		   }
		   else
		   {
			   System.err.println("Id is not Available");
		   }
		   sc.close();
	   }

}



/*You're tasked with developing a Java program to manage student information. 
 * To achieve this, you need to create a program that allows users to input a student's name, roll number, 
 * and marks for 5 subjects as command line arguments. 
 * The program should then calculate and display the student's average mark with the student name and roll number.
Output :
--------------
Student Details:
Name: Virat
Roll Number: 12345
Marks:
Subject 1: 90.5
Subject 2: 85.0
Subject 3: 78.5
Subject 4: 92.0
Subject 5: 88.5
Average Mark: 86.7
*/
public class Average_marks {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
		String str="";
		str=args[0];
		System.out.println("Enter student Name:"+args[0]);
		int roll=Integer.parseInt(args[1]);
		System.out.println("Enter Roll Number:"+args[1]);
		System.out.println("Enter marks:");
		
		int s1=Integer.parseInt(args[2]);
		System.out.println("Subject 1:"+args[2]);
		int s2=Integer.parseInt(args[3]);
		System.out.println("Subject 2:"+args[3]);
		int s3=Integer.parseInt(args[4]);
		System.out.println("Subject 3:"+args[4]);
		int s4=Integer.parseInt(args[5]);
		System.out.println("Subject 4:"+args[5]);
		int s5=Integer.parseInt(args[6]);
		System.out.println("Subject 5:"+args[6]);
		
		float average=(s1+s2+s3+s4+s5)/5;
		System.out.println("Average:"+average);
	}

}

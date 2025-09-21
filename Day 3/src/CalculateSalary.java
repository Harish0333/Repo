/*Write a program to input the basic salary of a person. He get 15% of the basic as HRA, 
 * 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. 
 * The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance.
 * Calculate and print the total salary of person.Take the Basic Salary from Command Line Argument
Complete code according to above logic and Save the code to a file named CalculateSalary.java
Open your command prompt or terminal and navigate to the directory where you saved the file.
Compile the program using the javac command: javac CalculateSalary.java
Run the program with salary amount as command-line arguments
Example 1:
Input:
java CalculateSalary 28000
Output:
Basic Salary is: Rs 28000.0
HRA is 15% of Basic Salary which is: Rs 4200.0
Conviyence is 15% of Basic Salary which is: Rs 4200.0
Entertainment Allowance is 10% of Basic Salary which is: Rs 2800.0
Total Salary is: Rs 39200.0
Example 2:
Input:
java CalculateSalary
Output:
Please provide Salary amount in command line
For Example java CalculateSalary 50000
*/
public class CalculateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//verify length of an array. if it is not equal to one then print error
		//Declare variables
		//Calculate Total Salary
		//Print results
		
		Double basic=Double.parseDouble(args[0]);
		double hra= (basic*15)/100;
		double con=(basic*15)/100;
		double enter=(basic*10)/100;
		double total=hra+con+enter+basic;
		
		System.out.println(" Basic Salary is: Rs"+basic);
		System.out.println(" HRA is 15% of Basic Salary which is: Rs"+hra);
		System.out.println(" Conviyence is 15% of Basic Salary which is: Rs"+con);
		System.out.println(" Entertainment Allowance is 10% of Basic Salary which is: Rs"+enter);
		System.out.println(" Basic Salary is: Rs"+total);
	}

}

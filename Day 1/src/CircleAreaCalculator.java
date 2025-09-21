/*Write a program to find out the area of circle by taking the value from Command line arguments
To find the area of a circle using command-line arguments in Java, 
you can pass the radius of the circle as an argument and then 
calculate the area using the formula: Area = π * radius * radius
1.	Save the code to a file named CircleAreaCalculator.java.
2.	Open your command prompt or terminal and navigate to the directory where you saved the file.
3.	Compile the program using the javac command:
javac CircleAreaCalculator.java
Example 1: Run the program with the radius of the circle as a command-line argument:
Input:
java CircleAreaCalculator 2.0
Output:
The area of the circle with radius 2.0 is: 12.566370614359172
Example 2:
Input:
java CircleAreaCalculator
Output:
Usage: java CircleAreaCalculator <radius>
Example 3:
Input:
java CircleAreaCalculator -3
Output:
Error: Radius must be a non-negative number.*/
public class CircleAreaCalculator 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implement the logic to find size of a command line arguments
		// if size is not 1 then print error message and exit the program else continue the program
	    // Parse the command-line argument as a double
		// Check if the radius is non-negative
		// if Value is negative then print the error message and exit the program. Else continue       
		 // Calculate the area of the circle and print the results  
		double r=Double.parseDouble(args[0]);
		double pie=3.14;
		double area=pie*r*r;
		System.out.println("The area of the circle with radius :"+r+"is:"+area);
	}
}

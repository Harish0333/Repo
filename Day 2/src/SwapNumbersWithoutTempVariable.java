/*
 * Write a program to interchange the value of two numbers without using the third variable 
 * where number must be taken from command line argument.
Write the program and Save the code to a file named SwapNumbersWithoutTempVariable.java
Open your command prompt or terminal and navigate to the directory where you saved the file.
Compile the program using the javac command: javac SwapNumbersWithoutTempVariable.java
Run the program with two numbers as command-line arguments:
Example 1:
Input:
java SwapNumbersWithoutTempVariable 6 7
Output:
Original Values: num1 = 6, num2 = 7
Swapped Values: num1 = 7, num2 = 6
Example 2:
Input:
java SwapNumbersWithoutTempVariable 3
Output:
Usage: java SwapNumbersWithoutTempVariable <num1> <num2>*/
public class SwapNumbersWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a logic to display error if arguments length is not equals to 2       
		// Parse command-line arguments as integers		        
		// Display the original values		       
        // Swap the values without using a third variable
       // Display the swapped values
		if (args.length < 2) {
            System.out.println("Usage: java SwapNumbersWithoutTempVariable <num1> <num2>");
            return;
        }

        // Parse command line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Display original values
        System.out.println("Original Values: num1 = " + num1 + ", num2 = " + num2);

        // Swap the values without using a third variable
        num1 = num1 + num2;//6+7=13
        num2 = num1 - num2;//13-7=6
        num1 = num1 - num2;//13-6=7

        // Display swapped values
        System.out.println("Swapped Values: num1 = " + num1 + ", num2 = " + num2);
    }
}


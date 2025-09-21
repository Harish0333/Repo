/*Write a program to find the sum and average of three numbers where numbers must be taken from command line argument.
Save the code to a file named SumAndAverageCalculator.java.
Open your command prompt or terminal and navigate to the directory where you saved the file.
Compile the program using the javac command: javac SumAndAverageCalculator.java
Run the program with three numbers as command-line arguments:
Example 1:
Input:
java SumAndAverageCalculator 3.0 2.2 4.3
Output:
Sum of the three numbers: 9.5
Average of the three numbers: 3.1666666666666665
Example 2:
Input:
java SumAndAverageCalculator 3 1
Output:
Usage: java SumAndAverageCalculator <num1> <num2> <num3>*/
		// TODO Auto-generated method stub
		// Find arguments size. If it is not equal to 3 then print "Usage: java SumAndAverageCalculator        
		//<num1> <num2> <num3>" error message and exit from the program.   
        // Parse command-line arguments as doubles   
        // Calculate the sum       
        // Calculate the average
        // Display the results   
		
		/*Write a program to find the sum and average of three numbers where numbers must be taken from command line argument.
		Save the code to a file named SumAndAverageCalculator.java.
		Open your command prompt or terminal and navigate to the directory where you saved the file.
		Compile the program using the javac command: javac SumAndAverageCalculator.java
		Run the program with three numbers as command-line arguments:
		Example 1:
		Input:
		java SumAndAverageCalculator 3.0 2.2 4.3
		Output:
		Sum of the three numbers: 9.5
		Average of the three numbers: 3.1666666666666665
		Example 2:
		Input:
		java SumAndAverageCalculator 3 1
		Output:
		Usage: java SumAndAverageCalculator <num1> <num2> <num3>*/

				// TODO Auto-generated method stub
				// Find arguments size. If it is not equal to 3 then print "Usage: java SumAndAverageCalculator        
				//<num1> <num2> <num3>" error message and exit from the program.   
		        // Parse command-line arguments as doubles   
		        // Calculate the sum       
		        // Calculate the average
		        // Display the results   
				
		public class SumAndAverageCalculator {
		    public static void main(String[] args) {
		        if (args.length < 3) {
		            System.out.println("Usage: java SumAndAverageCalculator <num1> <num2> <num3>");
		            return;
		        }

		        // Parse command line arguments
		        double num1 = Double.parseDouble(args[0]);
		        double num2 = Double.parseDouble(args[1]);
		        double num3 = Double.parseDouble(args[2]);

		        // Calculate sum and average
		        double sum = num1 + num2 + num3;
		        double average = sum / 3;

		        // Display results
		        System.out.println("Sum of the three numbers: " + sum);
		        System.out.println("Average of the three numbers: " + average);
		    }
		}



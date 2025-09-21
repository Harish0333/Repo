/*
 * Write a java program in eclipse or editplus or Notepad to perform Addition using command line argument.
1.      Save the code to a file named ‘CommandLineAddition.java’.
2.      Open your command prompt or terminal and navigate to the directory where you saved the file.
3.      Compile the program using the javac command:
4.      javac CommandLineAddition.java
5.      java CommandLineAddition 5.7 3.2
Output:
Addition Result: 8.9
If length is less than 2 then display below message then exit from the program.
Usage: java CommandLineAddition <num1> <num2>*/
public class CommandLineAddition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		float a=Float.parseFloat(args[0]);
		float b=Float.parseFloat(args[1]);
		System.out.println("Addition :"+(a+b));
		} 
		catch (Exception e)
		 {
			// TODO: handle exception
			System.out.println("java CommandLineAddition <num1> <num2>");
		}
	}
}

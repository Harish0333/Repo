
public class MainBatch 
{
/*create a class called Batch

instance variables:
int numStudents
String faculty
String course

create a parameterised constructor to initialise instance variables with numStudent to 100, faculty to Srinivas and course to C

create an instance method displayDetails() which should display instance variables.

2) Create a class JavaBatch. which is a sub class of Batch.

create a parameterised constructor to initialise super class's instance variables (numStudent to 150, 
faculty to Ravi Shankar and course to Java)

override displayDetails() method and print instance variables.

3) create a class DotNetBatch. which is a sub class of Batch.

create a parameterised constructor to initialise super class's instance variables (numStudent to 80, 
faculty to Ramesh and course to DotNet)

override displayDetails() method and print instance variables.

4) create a MainBatch class which should contain main method to test our code.

*/
	public static void main(String[] args) 
	{
		Batch b1= new Batch();
		b1.displayDetails();
		
		JavaBatch b2= new JavaBatch();
		b2.displayDetails();
		
		DotNetBatch b3=new DotNetBatch();
		b3.displayDetails();
	}

}

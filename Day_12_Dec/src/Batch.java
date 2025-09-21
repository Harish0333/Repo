
public class Batch 
{
	 int numStudents;
	 String faculty;
	 String course;
	
	public Batch() 
	{
		this.numStudents = 100;
		this.faculty = "Srinivas";
		this.course = "C";
	}
	
	public Batch(int numStudents, String faculty, String course) 
	{
		this.numStudents = numStudents;
		this.faculty = faculty;
		this.course = course;
	}

	public void displayDetails()
	{
		System.out.println("Num students :"+numStudents+" Faculty :"+faculty+" Course :+"+course);
	}
	
}

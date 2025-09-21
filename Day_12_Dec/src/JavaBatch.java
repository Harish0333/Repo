
public class JavaBatch extends Batch 
{
	public JavaBatch()
	{
		 this.numStudents=150;
		 this.faculty="Ravi Shankar" ;
		 this.course="Java";
	}
	
	public JavaBatch(int numStudents, String faculty, String course)
	{
		 super(numStudents, course, course);
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
	}
}

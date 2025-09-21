
public class DotNetBatch extends Batch 
{
	public DotNetBatch()
	{
		this.numStudents =80;
		this.faculty ="Ramesh";
		this.course = "DotNet";
	}
	public DotNetBatch(int numStudents, String faculty, String course)
	{
		super(numStudents, course, course);
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
	}
}

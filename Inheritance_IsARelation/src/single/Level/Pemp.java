package single.Level;

public class Pemp extends Emp 
{

	protected String department;
	protected String designation;
	
  public Pemp(int employeeId, String employeeName, String employeeAddress, String department, String designation) 
	{
		super(employeeId, employeeName, employeeAddress);
		this.department = department;
		this.designation = designation;
	}

@Override
public String toString() {
	return "Pemp [department=" + department + ", designation=" + designation + ", toString()=" + super.toString() + "]";
}


}

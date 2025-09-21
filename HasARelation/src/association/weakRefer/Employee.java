package association.weakRefer;

public class Employee {
	  private int employeeId;
	  private String employeeName;
	  private Organisation org;  //HAS-A Relation
	  
	public Employee(int employeeId, String employeeName, Organisation org) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.org = org;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", org=" + org + "]";
	}  
	  

}

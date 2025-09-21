package single.Level;

public class Emp 
{
		protected int employeeId;
	   protected String employeeName;
	   protected String employeeAddress;
	
	   public Emp(int employeeId, String employeeName, String employeeAddress) 
	   {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	   }

	@Override
	public String toString() {
		return "Emp [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + "]";
	}

}

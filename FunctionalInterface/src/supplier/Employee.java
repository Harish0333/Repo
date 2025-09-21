package supplier;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public void getEmployeeSalary()
	{
		System.out.println("Employee Salary is :"+employeeSalary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}	

}

package supplier;

public class SupplierDemo1 {
	public static void main(String[] args) 
	{
		Supplier<Employee> Empsup = ()-> 
		{
			Employee emp=new Employee(123,"HAri",55200.20);
			return emp;
		};
		Employee empy=Empsup.get();
		empy.getEmployeeSalary();
		System.out.println(empy);
	}
}

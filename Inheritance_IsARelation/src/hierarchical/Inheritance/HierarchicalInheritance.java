package hierarchical.Inheritance;

class Employee 
{
   protected double salary;
}


class Developer extends Employee 
{
  public Developer(double salary)
  {
	  this.salary = salary;
  }

	@Override
	public String toString() 
	{
		return "Developer [salary=" + salary + "]";
	}
  
  
}

class Designer extends Employee
{
	  public Designer(double salary)
	  {
		  this.salary = salary;
	  }

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	} 
	  
}

public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
		System.out.println(new Developer(80000));
		System.out.println(new Designer(45000));

	}
}

package classLoader;
class Customer{}
class Employee{}

public class Loader {

	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Class cls = Customer.class;
		System.out.println(cls.getName());
		
		cls = Employee.class;
		System.out.println(cls.getName());

	}

}


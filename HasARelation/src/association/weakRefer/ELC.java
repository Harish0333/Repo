package association.weakRefer;

public class ELC 
{
	public static void main(String[] args) 
	{
		Organisation wipro = new Organisation(1, "Wipro Limited", "Hyd");
		Organisation tcs = new Organisation(2, "TCS Limited", "Pune");
		
		Employee e1 = new Employee(101, "Virat", wipro);
		
		Employee e2 = new Employee(201, "Rohit", tcs);
		
		System.out.println(e1);
		System.out.println(e2);

	}
}

package types.four;
class Customer implements Cloneable
{
	int id;
	String name;	
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Customer [id=" + id + ", name=" + name + "]";
	}	
}

public class CloneMethod 
{
	public static void main(String[] args) throws CloneNotSupportedException 
    {
		Customer c1 = new Customer();	
		c1.id = 222;
		c1.name = "Rahul";
		
		Customer c2  = (Customer) c1.clone();
		c2.id = 333;
		c2.name = "Rohit";
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}


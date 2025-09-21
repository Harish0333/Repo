package supplier;

public class SupplierDemo {
	public static void main(String[] args) 
	{
		Supplier<String>  sup = ()->  15+14+"Ravi"+20+20;
		System.out.println(sup.get());
	}
}

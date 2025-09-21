package supplier;

public class SupplierDemo2 {
	public static void main(String[] args) 
	{
		Supplier<Player> plysup = ()-> 
		{
			Player plyr=new Player(123,"HAri");
			return plyr;
		};
		
		System.out.println(plysup.get());
	}
}

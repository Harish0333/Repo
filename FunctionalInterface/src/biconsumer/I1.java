package biconsumer;

public interface I1 {
public abstract void m1();
	
	public default void m2()
	{
		System.out.println("Default method");
		m4();
		m5();
	}
	
	public static void m3()  
	{
		System.out.println("static method");
		
	}
	
	private static void m4()
	{
		System.out.println("Private static method");
	}
	
	private void m5()
	{
		System.out.println("Private non-static method");
	}	

}

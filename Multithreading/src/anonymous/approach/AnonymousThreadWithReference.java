package anonymous.approach;

public class AnonymousThreadWithReference 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println("Child Thread :"+name);
			}
		};
		String name = Thread.currentThread().getName();
		System.out.println("Parent Thread :"+name);
		t1.setName("Child1");
		t1.start();
	}
}

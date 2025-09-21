package anonymous.approach;

public class AnonymousThreadWithoutReference 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		new Thread()
		{
			@Override
			public void run()
			{
				Thread t=Thread.currentThread();
				t.setName("Child 1");
				String name = Thread.currentThread().getName();
				System.out.println("Child Thread :"+name);
			}
		}.start();
	}
}

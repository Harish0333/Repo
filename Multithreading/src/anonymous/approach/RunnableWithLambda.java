package anonymous.approach;

public class RunnableWithLambda 
{
	public static void main(String[] args) 
	{
		Runnable r1=()->
		{
			String name = Thread.currentThread().getName();
			 for(int i=1; i<=10; i++)
			 {
				 System.out.println(i+" by "+ name);
			 }
		};
		
		Thread t1=new Thread(r1,"Child");
		t1.start();
		
		Thread t2=new Thread(new Ravi(),"Child");
		t2.start();
		
	}
}
class Ravi implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Java");
		}
	}
}

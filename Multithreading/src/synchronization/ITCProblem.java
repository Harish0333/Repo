package synchronization;

class Test implements Runnable
{
	int var = 0;	
	@Override
	public void run()
	{
		for(int i=1; i<=100; i++)   
		{
			var = var + i;     //var = 1 3 6 10 15 21 28
			try
			{
				Thread.sleep(200);
			}
			catch (Exception e)
			{
			}		          
		}
	}
}
public class ITCProblem 
{
	public static void main(String[] args) 
	{		
		Test t = new Test();
		Thread t1 = new Thread(t);		
		t1.start();
		try
		{
			Thread.sleep(200);
		}
		catch (Exception e)
		{
		}		
	    
		System.out.println(t.var);
	}
}

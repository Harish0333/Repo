package singlelevel.SuperVariable;

public class Daughter extends Father 
{
protected double balance = 18000;
	
	public void getBalance()
	{
		System.out.println("Daughter Balance is :"+balance);
		System.out.println("Father Balance is :"+super.balance);
	}

}

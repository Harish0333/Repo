package task_19_3;
public class NextMultipleOfHundred 
{
	public static int getNextMultipleOfHundred(int x)
	{
		int rem,res=0;
		if(x>99)
		{
			rem=x%100;
			res=x+100-rem;
		}
		else
		{
			System.out.println("Invalid input");
		}
		 return res;
	}
}

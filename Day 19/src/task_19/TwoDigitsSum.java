package task_19;
public class TwoDigitsSum 
{
	public static int getSumOfDigits(int x) 
	{
		int digit;
		int sum=0;
		while(x>0)
		{
			digit=x%10;
			sum+=digit;
			x=x/10;
		}
		return sum;
	}
}

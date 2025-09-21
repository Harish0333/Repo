package task_19_4;
public class RoundedSum 
{
	public static int sumOfRoundedValues(int x,int y,int z)
	{
		return roundmultiple(x)+roundmultiple(y)+roundmultiplee(z);
	}
	public static int roundmultiple(int x)
	{
		return (x%10)*10;
	}
	public static int roundmultiplee(int x)
	{
		return roundmultiple(x+9);
	}
}

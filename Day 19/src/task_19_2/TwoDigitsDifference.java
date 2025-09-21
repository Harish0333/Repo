package task_19_2;
public class TwoDigitsDifference 
{
	public static int getDiffOfDigits(int x)
	{
		int tens;
		int ones;
		tens=x%10;
		ones=x/10;
		return tens-ones;
	}
}

package bipredicate;

public class Lambda12 
{
	public static void main(String[] args) 
	{
		BiPredicate<Integer,Integer> Bip=(x, y)->
		{
			return (x+y)%2==0;
		};
		boolean res=Bip.test(4,2);
		System.out.println(res);
	}
}

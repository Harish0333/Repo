package bipredicate;

public class Lambda11 
{
	public static void main(String[] args) 
	{
		BiPredicate<String,Integer> Bip=(x, y)->
		{
			return x.length()==y;
		};
		
		boolean res=Bip.test("Hari",4);
		System.out.println(res);
	}
	
}

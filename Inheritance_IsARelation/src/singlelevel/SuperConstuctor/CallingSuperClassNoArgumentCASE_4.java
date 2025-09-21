package singlelevel.SuperConstuctor;

class AA
{
	AA()
	{
		this("Nit"); //Own class parameterized constructor
		System.out.println("No Argument Constructor of A ");
	}
	AA(String str)
	{
	    super();	
		System.out.println("My Institute Name is :"+str);
	}
}
class BB extends AA
{
	public BB()
	{
		super(); 
		System.out.println("No Argument Constructor of B ");
	}
}


public class CallingSuperClassNoArgumentCASE_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BB();
	}

}

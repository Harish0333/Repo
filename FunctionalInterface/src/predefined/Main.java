package predefined;

public class Main {

	public static void main(String[] args) 
	{
		Accept <Integer> intypo=new Accept<Integer>(100);
		System.out.println(intypo.getx());
		
		Accept<Double> doublo=new Accept<Double>(100.220);
		System.out.println(doublo.getx());

		Accept <Customer> custo=new Accept<Customer>(new Customer());
		System.out.println(custo.getx().toString());
		
		custo.getx().m1();
	}

}

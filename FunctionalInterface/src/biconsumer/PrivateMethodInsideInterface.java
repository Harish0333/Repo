package biconsumer;

public class PrivateMethodInsideInterface {

	public static void main(String[] args) {
		I1 i = new Implementer();
		i.m1();
		i.m2(); //def method
		I1.m3();	


	}

}

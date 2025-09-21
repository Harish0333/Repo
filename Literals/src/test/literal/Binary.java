package test.literal;

public class Binary {

	public static void main(String[] args) {
		int i = 0b101; 
		int j = 0B111;
		System.out.println(i); //5
		System.out.println(j); //7
		
		System.out.println(Integer.toBinaryString(7)); //111
	}

}

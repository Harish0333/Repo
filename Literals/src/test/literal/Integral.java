package test.literal;

public class Integral {

	public static void main(String[] args) {
    /*    byte b = 127; //error 128
		System.out.println(b);
		
		short s = 32767; //error 32768
		System.out.println(s);
		
		byte by = 125;
		short sh = b;    
		System.out.println(sh);

		short s = 128;
		byte b =  (byte)s;
		System.out.println(b);*/
		byte x = (byte) 127L;
		System.out.println("x value  = "+x);

		long l = 29L;
		System.out.println("l value  = "+l);

        int y =  (int) 18L; 
		System.out.println("y value  = "+y);


	}

}

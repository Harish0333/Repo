package string.literal;

public class Test {

	public static void main(String[] args) {
	       String str1 = "India";       
	       String str2 = new String("India");
	       
	       System.out.println(str1==str2);
	       
	       str2 = str2.intern();
	       
	       System.out.println(str1==str2);
	}

}

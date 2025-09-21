package string.literal;

public class StringGC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str1 = "india";
		System.out.println(str1 +" : "+str1.hashCode());
		
		str1 = null;
		System.gc(); //Calling the GC explicitly
		
		Thread.sleep(5000);
		
		String str2 = "india";
		System.out.println(str2 +" : "+str2.hashCode());

	}

}

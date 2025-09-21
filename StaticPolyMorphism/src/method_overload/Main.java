package method_overload;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s1 = new Sum();
		String add = s1.add("Data", "base");
		
		int x = s1.add(12, 12);
		double y = s1.add(12.89, 12.90);		
		
		System.out.println(add+" : "+x+" : "+y);

	}

}

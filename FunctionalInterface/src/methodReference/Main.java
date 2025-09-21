package methodReference;

public class Main {

	public static void main(String[] args) {
				//Using Lambda 
				Worker w1 = ()-> System.out.println("Employee working");
				w1.work();
				
				//Using Method Reference
				Worker w2 = new Employee()::work;
				w2.work();
	}

}

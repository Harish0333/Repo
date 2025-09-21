package consumer;

public class ConsumerDemo {

	public static void main(String[] args) 
	{
		Consumer<Integer> intypo=(x)->System.out.println(x);
		intypo.accept(123);
		
		Consumer<String> stringo =(str)->System.out.println(str);
		stringo.accept("Harish Nakka");

		Consumer<Student> stud =(y)->System.out.println(y);
		stud.accept(new Student(123,"Harish"));
	}

}

package hashMap;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Aryan");
		Employee e2 = new Employee(102,"Pooja");
		Employee e3 = new Employee(101,"Aryan");
		Employee e4 = e2;

		HashMap<Employee,String> hm = new HashMap<>();
		hm.put(e1,"Ameerpet");//101 aryan ammerpet
		hm.put(e2,"S.R Nagar");//102 pooja sr nagar
		hm.put(e3,"Begumpet");//101 aryan begumpet
		hm.put(e4,"Panjagutta");//102 pooja panjagutta

		hm.forEach((k,v)-> System.out.println(k+" : "+v));


	}

}

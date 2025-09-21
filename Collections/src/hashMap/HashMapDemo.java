package hashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("A", 55);
		hm.put(new String("A"), 21);
		System.out.println(hm.size());
		System.out.println(hm);

	}

}

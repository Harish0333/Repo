package hashMap;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(128, "A");
		hm1.put(128, "B");
		
		System.out.println(hm1.size());
		System.out.println(hm1);

	}

}

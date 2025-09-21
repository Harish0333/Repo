package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo7 {

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<>(); 
		map.put(1, "C");
		map.put(2, "C++");
		map.put(3, "Java");
		map.put(4, ".net");
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}

}

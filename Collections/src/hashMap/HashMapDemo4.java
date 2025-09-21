package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {

	public static void main(String[] args) 
	{
        Map<String,String> map = new HashMap<>();
		   map.put("Ravi", "12345");  
		   map.put("Rahul", "12345");
		   map.put("Aswin", "5678");
		   map.put(null, "6390");
		   map.put("Ravi","1529");

		   System.out.println(map); 

		   System.out.println(map.get(null));  
		   System.out.println(map.get("Virat"));  
		   
		   map.forEach((k,v)-> System.out.println("Key is :"+k+" value is "+v));
	}

}

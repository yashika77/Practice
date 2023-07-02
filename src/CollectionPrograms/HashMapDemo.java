package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Works in key value pair,
		//key is unique, value may vary
		//if tries to enter same key, it overrides the previous value with the new one.
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Ram");
		hm.put(2, "Shyam");
		hm.put(3, "Laxman");
		hm.put(4, "Sita");
		hm.put(5, "Gita");
		hm.put(6, "Ravan");
		
		System.out.println(hm);
		
		//hm.put(2, "Krishna");// it overrides the value of 2 from Shyam to Krishna
		//System.out.println(hm);
		
		//to avoid this we can use following methods
		
		if(!hm.containsKey(2))
		{
			hm.put(2, "Krishna");
			
		}
		System.out.println(hm);
		
		//To iterate in Map
		/*for (Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			*/
		
		//To iterate using for each
		
		hm.forEach((key,value)->
		{
			System.out.println(key+ " => "+value);
			});
			
			
		}
	}



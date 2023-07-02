package CollectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// No duplicacy allowed, order is not maintained.
		
	Set<Integer> s= new HashSet<>();
		s.add(32);
		s.add(12);
		s.add(44);
		s.add(67);
		s.add(76);
		s.add(13);
		s.add(55);
		
		System.out.println(s);
		
		s.remove(12);
		System.out.println(s);
		
		System.out.println(s.contains(55));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.clear();
		
		System.out.println(s);
		
	

	}

}

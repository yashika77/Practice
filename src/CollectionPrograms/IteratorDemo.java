package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList <String> al= new ArrayList<>();
		al.add("Ram");
		al.add("Shyam");
		al.add("Sita");
		al.add("Gita");
		al.add("Laxman");
		
		System.out.println(al);
		
		Iterator<String> it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		System.out.println(al);
		
		
	}

}

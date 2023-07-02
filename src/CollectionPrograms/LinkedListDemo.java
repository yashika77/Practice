package CollectionPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//LinkedList has same functions as that of ArrayList
public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> l=new LinkedList<>();
		
		l.add(32);
		l.add(4);
		l.add(99);
		l.add(12);
		l.add(67);
		
		//System.out.println(l);
		
		//System.out.println(l.get(2));
		
		//To iterate using for each
		
		l.forEach((key)->{System.out.print(key+" ");});
		System.out.println();
		
		//To iterate using iterator
		
		Iterator<Integer> itr= l.iterator();
		while (itr.hasNext()) {
			Integer n = itr.next();
			//System.out.print(n);
			if(n==99)
			{
				itr.remove();
			}		
		}	
		System.out.println(l);
		
		
	}

}

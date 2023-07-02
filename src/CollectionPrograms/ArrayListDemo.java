package CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Yashika");
		al.add("Swati");
		al.add("Himani");
		al.add("Shubhra");
		
		System.out.println("The Array List is: " +al);
		
		System.out.println(al.get(3));
		System.out.println(al.remove(0));
		System.out.println(al.size());
		al.add(0, "Yashika1");
		
		System.out.println(al);
		
		List<String> l=new ArrayList<>();
		l.add("Sharma");
		l.add("Yadav");
		
		al.addAll(l);
		
		System.out.println(al);
		
		

	}

}

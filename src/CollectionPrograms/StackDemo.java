package CollectionPrograms;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> animals =new Stack<>();
		
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Fox");
		animals.push("Elephant");
		animals.push("Cow");
		animals.push("new");
		
		animals.pop();	//This will delete last added element	
		
		System.out.println(animals);
		
		System.out.println(animals.peek());

	}

}

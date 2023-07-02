package CollectionPrograms;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// Doubly Ended Queue(De-Que), you can insert/remove/peek elements from head and tail both.
		
		ArrayDeque<Integer> adq= new ArrayDeque<>();
		
		adq.offer(2);
		adq.offer(23);
		adq.offer(45);
		adq.offer(11);
		adq.offer(12);
		
		System.out.println(adq);
		
		adq.poll();
		
		adq.offer(88);
		
		adq.offerFirst(99);
		adq.offerLast(67);
		
		adq.pollLast();
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq);

	}

}

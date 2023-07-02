package CollectionPrograms;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.offer(22);
		pq.offer(45);
		pq.offer(11);
		pq.offer(12);
		
		System.out.println(pq);//it prints in sequential order, 
		//minHeap is working at backend where the smallest element is placed at the top
		pq.poll();

		System.out.println(pq);// The order changes again
		
		System.out.println(pq.peek());
	}

}

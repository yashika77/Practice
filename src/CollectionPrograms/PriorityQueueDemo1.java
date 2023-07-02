package CollectionPrograms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 
{
	public static void main(String[] args) 
	{
		// We want to set the priority to the highest number
		PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());// it reverses the order of queue, 
		//now it has changed from minHeap to maxHeap
		pq.offer(22);
		pq.offer(45);
		pq.offer(11);
		pq.offer(12);
		
		System.out.println(pq);//it prints the highest number first, 
		//maxHeap is working at backend where the highest element is placed at the top
		pq.poll();

		System.out.println(pq);// The order changes again
		
		System.out.println(pq.peek());
	}
		
}



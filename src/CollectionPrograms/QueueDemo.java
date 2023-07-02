package CollectionPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();// here linked list is the class which implements Queue interface
		// LL now has all the methods provided by Queue
		
		q.offer(20);//adds element in queue
		q.offer(10);
		q.offer(30);
		
		System.out.println(q);
		
		q.poll();//It works on FIFO, so 1st element(10) would be deleted
		
		System.out.println(q);
		
		System.out.println(q.peek());//returns head of the queue
	}

}

package queue;

import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(20);
		pq.offer(40);
		pq.offer(5);
		pq.offer(10);
		
		System.out.println("PrioritQueue :" + pq);
		
		//check is the queue empty
		while(!pq.isEmpty()) {
			System.out.println("Polled: " + pq.poll());
		}
	}

}

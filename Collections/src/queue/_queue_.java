package queue;

import java.util.LinkedList;
import java.util.Queue;

public class _queue_ {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("bala");
		queue.offer("moj");
		queue.offer("jeeva");
		queue.offer("vishva");
		
		System.out.println(queue);
		System.out.println(queue.element());
		queue.poll();
		System.out.println(queue);
		

		
	
	}

}

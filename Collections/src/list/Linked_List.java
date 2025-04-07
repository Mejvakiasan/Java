package list;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String[]args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		numbers.addFirst(0);
		numbers.addLast(5);
		
		System.out.println(numbers.getFirst());
		System.out.println(numbers.getLast());
		
		numbers.removeFirst();
		numbers.removeLast();
		
		
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
		LinkedList<String> letters = new LinkedList<String>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		
		Collections.reverse(letters);
		System.out.println(letters);
		
	}
	
}

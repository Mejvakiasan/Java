package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class SortByLength {

	public static void main(String[] args) {
		//sort by length
		String[] words = {"banana", "apple", "cherry", "kiwi"};
		
		Arrays.sort(words, Comparator.comparingInt(String::length));
		System.out.println("Sort by length :" + Arrays.toString(words));
		
		//sort with java 8 stream
		String[] arrange = {"banana", "apple", "cherry", "kiwi"};
		
		String[] sortedWords = Arrays.stream(arrange).sorted().toArray(String[]::new);		
		
		System.out.println("Sort by java 8 stream :" + Arrays.toString(sortedWords));

	}

}

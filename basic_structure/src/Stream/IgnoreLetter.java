package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IgnoreLetter {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "banana", "Apricot", "Cherry", "avocado", "Blueberry", "Kiwi");
		
		List<String> SortedWords = words.stream()
				.filter(word -> !word.toLowerCase().startsWith("a"))
				.sorted((s1,s2) -> Integer.compare(s1.length(), s2.length()))
				.collect(Collectors.toList());
		
		System.out.println("Sort by length and filter a :" + SortedWords);
	}

}

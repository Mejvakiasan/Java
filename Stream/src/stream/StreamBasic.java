package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {

	public static void main(String[] args) {
		
		//Filter out even numbers from a list and
		//return a list of squares of those numbers.
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> result = numbers.stream().filter(n -> n%2 ==0).map(n -> n*n)
		.collect(Collectors.toList());
		System.out.println(result);
		
		// Count the number of strings with length > 3
		List<String> names = Arrays.asList("Bala", "moj", "Vis", "jeeva", "Bala");
		long count = names.stream().filter(w -> w.length()>3).count();
		System.out.println(count);
		
		//Get the first non-null, non-empty string from a list
		List<String> list = Arrays.asList(null, "", "", "Bala", "moj", "jeeva");
		
		String first =  list.stream()
		.filter(l -> l != null && !l.trim().isEmpty())
		.findFirst().orElse("No valid String");
		
		System.out.println(first);
		
		//Convert a list of strings to a comma-separated string
		List<String> nam = Arrays.asList("Bala", "moj", "Vis", "jeeva", "Bala");
		
		String results =  nam.stream().collect(Collectors.joining(", "));
		System.out.println(results);
				
	}

}

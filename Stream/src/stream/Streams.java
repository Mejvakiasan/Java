package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bala", "moj", "visu", "diva",
				"Ball");
		
		//basic stream
		names.stream().filter(name -> name.startsWith("B")).map(String::toUpperCase)
		.forEach(System.out::println);
		
		//stream
		List<String> result = names.stream().filter(n -> n.startsWith("B"))
				.map(String::toUpperCase).sorted().collect(Collectors.toList());
		System.out.println(result);
	}

}

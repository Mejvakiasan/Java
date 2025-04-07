package set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<>();
		
		//natural ordering
		//no duplication
		names.add("Bala");
		names.add("Moj");
		names.add("Diva");
		names.add("Jeeva");
		names.add("Vishva");
		names.add("Bala");
		
		//doesn't allow nul throws nullpointer exception
		
		System.out.println(names);
	}

}

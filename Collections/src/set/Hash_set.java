package set;

import java.util.HashSet;
import java.util.Set;

public class Hash_set {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//avoid duplication
		set.add("Bala");
		set.add("Diva");
		set.add("Moj");
		set.add("Bala");
		set.add("Jeeva");
		set.add("null");
		//allow only one null value

		//Doesn't follow order
		System.out.println(set);
	}

}

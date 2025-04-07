package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash_set {

	public static void main(String[] args) {
		Set<String> list = new LinkedHashSet<>();
		
		//avoid duplication
		list.add("Bala");
		list.add("Moj");
		list.add("Diva");
		list.add("Bala");
		list.add("Jeeva");
		
		//follow ordering
		System.out.println(list);
	}
	

}

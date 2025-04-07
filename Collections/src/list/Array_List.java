package list;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	public static void main(String[] args0) {
		
		//ArrayList
		
		List<String> name = new ArrayList<>();
		
		name.add("Bala");
		name.add("Moj");
		name.add("Diva");
		

		System.out.println(name.get(2));
		System.out.println(name.size());
		//name.remove(1);
		
		
		for(String names : name) {
			System.out.println(names);
		}
	}
}

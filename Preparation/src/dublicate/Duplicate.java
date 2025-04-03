package dublicate;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		findDuplicateString( new String[] {"Bala","Bala","moj","jeeva","moj"});
	}
	
	public static void findDuplicateString(String[] name) {
		Set<String> seen = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		
		for(String str : name) {
			if(seen.contains(str)) {
				duplicates.add(str);
			}else {
				seen.add(str);
			}
		}
		System.out.println("Duplicate Strings : " + duplicates + "\n" + "List of Strings   : " + seen);
	}

}

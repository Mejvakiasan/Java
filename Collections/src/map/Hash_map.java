package map;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Bala");
		map.put(2, "moj");
		map.put(3, "jeeva");
		map.put(4, "Vis");
		//value can duplicate
		//no key duplication
		map.put(5, "Bala");
		
		System.out.println("Value: " + map.get(2));
		System.out.println("Full map: " +map);

	}

}

package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash_map {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Bala");
		map.put(2, "moj");
		map.put(3, "Jeeva");
		map.put(4, "vis");
		//value can duplicate
		//key no duplication
		map.put(null, "Bala");
		map.put(null, "vis");
		
		//only one key allowed
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "->" + entry.getValue());
		}
	}

}

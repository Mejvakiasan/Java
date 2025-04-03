package Duplication;

import java.util.HashSet;

public class Duplication {

	public static void main(String[] args) {
		int[] arr = {0,3,2,1,3};
		System.out.println(findDuplicate(arr));
			
	}
	public static int findDuplicate(int[] arr) {
		HashSet<Integer> seen = new HashSet<>();
		for(int num : arr) {
			if(seen.contains(num)) {
				return num;
			}
			seen.add(num);
		}
		return -1;
		
	}

}

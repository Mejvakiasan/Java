package Stream;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr = {5,2,3,8,1};
		arr = Arrays.stream(arr).sorted().toArray();
		System.out.println(Arrays.toString(arr));

	}

}

package array;

public class LargestArray {

	public static void main(String[] args) {
		int[] array = {10, 40, 5, 58, 30};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : array) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			}else if(num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}
		System.out.println(secondLargest);
	}

}

package BasicCode;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 5, 7, 2, 8};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);
    

	}

}

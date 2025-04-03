package BasicCode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("Reversed String:" + reversed);
	}

}

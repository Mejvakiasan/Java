package BasicCode;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "madam";
	        boolean isPalindrome = true;
	        int length = input.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (input.charAt(i) != input.charAt(length - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        if (isPalindrome) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }

	}

}

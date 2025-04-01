package BasicCode;


public class Demo {
    public static void main(String[] args) {
        String password = "madam12321madam";
        if (isPalindrome(password)) {
            System.out.println("The password is a palindrome and highly secure.");
        } else {
            System.out.println("The password is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

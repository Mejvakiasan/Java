package Try_Catch_Finally;

public class TryCatchFinally {

	public static void main(String[] args) {
		// Example 1: ArithmeticException (Divide by zero)
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero. Message: " + e.getMessage());
        }

        // Example 2: ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[3]); // Index 3 is out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds. Message: " + e.getMessage());
        }

        // Example 3: NumberFormatException (Parsing a non-numeric string)
        String numberString = "abc";
        try {
            int parsedNumber = Integer.parseInt(numberString);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format. Message: " + e.getMessage());
        }

        // Example 4: FileNotFoundException (Checked exception)
        try {
            java.io.FileReader fileReader = new java.io.FileReader("nonexistent.txt"); // This can throw FileNotFoundException
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error: File not found. Message: " + e.getMessage());
        }

        // Example 5: Using finally block
        try {
            int result = 20 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception");
        } finally {
            System.out.println("This block always executes.");
        }

	}

}

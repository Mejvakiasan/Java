package Pattern;

public class SquarePattern {

	public static void main(String[] args) {
		int n = 6;
		printPattern(n);
	}
	
	public static void printPattern(int n) {
        int i, j;
        // Outer loop to handle number of rows
        for (i = 0; i < n; i++) {
            // Inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // Print '*' if it is in first row, last row,
                // first column, or last column
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                }
                // Otherwise print space
                else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}

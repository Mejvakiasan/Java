package Maths;

public class FibonacciTriangle {
	public static void main(String[] args) {
		int n = 10; // Number of rows
        int a = 0, b = 1;

        System.out.println("Fibonacci Triangle with " + n + " rows:");
        
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print Fibonacci numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
        System.out.println();
    }
}	


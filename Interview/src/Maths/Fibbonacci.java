package Maths;

public class Fibbonacci {

	public static void main(String[] args) {
		int n = 10;
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci Series up to" + n + " terms:");
	
	
	for(int i=1; i <= n; ++i) {
		System.out.print(firstTerm + " ");
		int nextTerm = firstTerm + secondTerm;// Calculate next term Fn = F(n-1) + F(n-2)
		firstTerm = secondTerm;// Update firstTerm to F(n-1)
        secondTerm = nextTerm; // Update secondTerm to Fn
	}
	}
}

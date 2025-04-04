package loop;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		//Basic while loop
		int i = 1;
		
		while(i <= 5) {
			System.out.println("Iterations :" + i);
			i++;
		}
		
		// #2 while loop
		 Scanner scanner = new Scanner(System.in);
	        String input = "";

	        while (!input.equals("exit")) {  // Keep running until user types "exit"
	            System.out.print("Enter a command (type 'exit' to stop): ");
	            input = scanner.nextLine();
	        }

	        System.out.println("Program ended.");
	        scanner.close();

	}

}

package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		  try {
	            FileReader reader = new FileReader("test.txt"); // 👈 Might throw FileNotFoundException
	            BufferedReader br = new BufferedReader(reader);
	            System.out.println(br.readLine());
	            br.close();
	        } catch (IOException e) {
	            System.out.println("File error: " + e.getMessage());
	        }

		  //throws
		  
	}

}

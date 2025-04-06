package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tthrows {

	public static void main(String[] args) throws IOException {
		 FileReader reader = new FileReader("test.txt"); // FileNotFoundException is a checked exception
	        BufferedReader br = new BufferedReader(reader);
	        System.out.println(br.readLine());
	        br.close();

	}

}

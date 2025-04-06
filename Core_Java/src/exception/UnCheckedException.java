package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnCheckedException {

	//Custom checked 
	//Arithmetic Exception
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int result = a/b;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Error :" + e.getMessage());
		}
		
		//ArrayIndexOutOfBoundsException
		try {
			int[] arr = {1,2,3,4};
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		//NumberFormatException
		try {
			String name = "abc";
			int num = Integer.parseInt(name);
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		//NullPointerException
		try {
			String name = null;
			System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}

package loop;

public class try_catch_finally {

	public static void main(String[] args) {
		
		//ArithmeticException
		try {
			int result = 10/0;
			System.out.println("Result: " + result);
		}catch(ArithmeticException e){
			System.out.println("Error: Division by zero is not allowed");
		}finally {
			System.out.println("Exception completed");
		}
		
		//ArrayIndexOutOfBoundsException
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[5]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}catch(Exception e) {
			System.out.println("Someother Exception occured");
		}
	}

}

package loop;

public class if_else {

	public static void main(String[] args) {
		int num = 10;
		
		if(num > 0) {
			System.out.println("Positive number");
		}else {
			System.out.println("Not a positive number");
		}
		
		//Ladder if-else
		int mark = 90;
				
		if(mark >= 90) {
			System.out.println("Grade: A");
		}else if(mark >= 75) {
			System.out.println("Grade: B");
		}else if(mark >= 50) {
			System.out.println("Grade: C");
		}else {
			System.out.println("Grade: F");
		}
		
		//nested if-else
		int age = 20;
		boolean ID =true;
		
		if(age >= 18) {
			if(ID) {
				System.out.println("Your are allowed to enter");
			}else {
				System.out.println("Please enter your ID");
			}
		}else {
			System.out.println("Your are not allowed to enter");
		}
	}

}

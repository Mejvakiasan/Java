package loop;

public class for_loop {

	public static void main(String[] args) {
		
		//simple for loop
		for(int i=1; i <= 5; i++) {
			System.out.println("Iteration :" + i);	
		}
		System.out.println();
		
		//Array for loop
		int[] numbers = {1,2,3,4,5};
		
		for(int i=0; i < numbers.length; i++) {
			System.out.println("Elements at a index :" + i + ":" + numbers[i]);
		}
		System.out.println();
		
		//string for loop
		String[] names = {"Bala", "Moj", "Diva"};
		for(String name : names) {
			System.out.println("Names : " + name);
		}
		
	}

}

package BasicCode;

public class Prime {

	public static void main(String[] args) {
		int number = 29;
		boolean isPrime = true;
		for(int i=2; i<= number/2; i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number + "prime");
		}else {
			System.out.println(number + "not prime");
		}

	}

}

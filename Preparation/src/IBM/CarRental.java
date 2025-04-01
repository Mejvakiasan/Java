package IBM;

public class CarRental {
	
	public static int calculateAmmount(int distance, int hour) {
		
		//Condition: 4 Invalid input
		if (distance == 0 || hour == 0) {
			System.out.println("invalid Input");
			return -1;
		}
		
		//Base fare
		int baseAmount = 2000;
		
		//Condition:2 If within the base condition
		if(distance <= 240 && hour <= 6) {
			return baseAmount;
			}
		
		int extraCharge = 0;
		 // Condition 3: If only hours exceed
		if(hour > 6 && distance <= 240) {
			extraCharge = (hour - 6) * 20;
		}
		
		// Condition 5: If distance exceeds, prioritize distance calculation
		if(distance > 240) {
			extraCharge = (distance - 240)*100;
		}
		 return baseAmount+extraCharge;
		
	}

	public static void main(String[] args) {
		int distance1 = 0;
		int hour1 = 4;
		int result1 = calculateAmmount(distance1, hour1);
		if(result1 != -1 ) System.out.println("Amount: " + result1);
		
		int distance2 = 230;
		int hour2 = 8;
		int result2 = calculateAmmount(distance2, hour2);
		if(result2 != -1 ) System.out.println("Amount: " + result2);
		
		int distance3 = 260;
		int hour3 = 7;
		int result3 = calculateAmmount(distance3, hour3);
		if(result3 != -1 ) System.out.println("Amount: " + result3);
	}

}

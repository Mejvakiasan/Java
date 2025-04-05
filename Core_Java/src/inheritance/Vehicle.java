package inheritance;

class Vechicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class that inherits from Vehicle
class Car extends Vechicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Vehicle {

	public static void main(String[] args) {
		   Car myCar = new Car();

	        // Call method from parent class
	        myCar.start();

	        // Call method from child class
	        myCar.drive();

	}

}

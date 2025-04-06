package abstraction;

interface Vehicle{
	void start();
	void stop();
}

class Car implements Vehicle{
	public void start() {
		System.out.println("Car Started");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
	
}

class Bike implements Vehicle{
	public void start() {
		System.out.println("Bike started");
	}
	
	public void stop() {
		System.out.println("Bike stopped");
	}
}

public class Interface {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
	}

}

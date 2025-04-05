package polymorphism;

public class MethodOverLoading {
	
	//MethodOverLoading 
	//Method overloading happens at compile time
	//consider as a calculator class
	public int add (int a , int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverLoading calc = new MethodOverLoading();
			
		System.out.println(calc.add(1, 2));
		System.out.println(calc.add(1, 2, 3));
		System.out.println(calc.add(1.1, 2.0));
	}
}

package constructor;

//constructor overloading
public class ConstructorOverloading {
	String name;
	int age;
	
	//Default
	public ConstructorOverloading() {
		this.name = "Unknown";
		this.age = 0;
	}
		
	public ConstructorOverloading(String name) {
		this.name = name;
		this.age = 18;
	}
	
	//Parameterized
	public ConstructorOverloading(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+ name+ " " + "Age: " + age);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading s1 = new ConstructorOverloading();
		ConstructorOverloading s2 = new ConstructorOverloading("Bala");
		ConstructorOverloading s3 = new ConstructorOverloading("Moj", 18);
		
		s1.display();
		s2.display();
		s3.display();
	}
	
	}
	


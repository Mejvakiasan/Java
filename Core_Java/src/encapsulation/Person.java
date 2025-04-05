package encapsulation;

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			if(age > 0) {
				this.age = age;			
			}else {
			System.out.println("Age must be Positive");
			}
		}

	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Bala");
		p.setAge(18);
		
		System.out.println(p.getName() + " " +p.getAge());

	}

}

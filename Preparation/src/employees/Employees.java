package employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employees {
	
	private int id;
	private String name;
	private double salary;
	
	

	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public Employees(double salary) {
		super();
		this.salary = salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	
	
	public double getSalary() {
		return salary;
	}



	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		List<Employees> employees = new ArrayList<>();
		employees.add(new Employees(1, "Bala", 40000));
		employees.add(new Employees(2, "Moj", 50000));
		employees.add(new Employees(3, "Jeeva", 60000));
		employees.add(new Employees(4, "Diva", 70000));
		employees.add(new Employees(5, "Visu", 800000));

		//Employee with the Highest Salary -- min() for lowest salary
		Optional<Employees> highestSalary = employees.stream()
				.max(Comparator.comparing(Employees::getSalary));
		
		System.out.println("Min Max");
		highestSalary.ifPresent(emp -> 
		System.out.println("Name :" + emp.getName()+ " " + "Salary: " + emp.getSalary()));
		System.out.println();
		
		//Sort Employees by Salary in Descending Order reversed() -- without reversed() is ascending order
		//top 3 salary
		List<Employees> sortBySalary = employees.stream()
				.sorted(Comparator.comparing(Employees::getSalary).reversed())
				.limit(3)
				.collect(Collectors.toList());
		System.out.println("Orders");
		sortBySalary.forEach(emp -> System.out.println("ID :" + emp.getId() + " " + "Salary :" + emp.getSalary()));
		System.out.println();
		
		
		//Average Salary
	double avgSalary = employees.stream()
			.mapToDouble(Employees::getSalary)
			.average().orElse(0.0);
	
	System.out.println("Average Salary :" +avgSalary);
	System.out.println();
	
	
	//Convert Employee List to a Map (ID → Name)
	Map<Integer, String> employeeMap = employees.stream()
			.collect(Collectors.toMap(Employees::getId, Employees::getName));
	
	employeeMap.forEach((id, names) -> 
	System.out.println("ID :"+id + " "+"Names :" + names));
	System.out.println();
	
	//Starts with specific letter
	List<Employees> filterEmployee = employees.stream()
			.filter(emp -> emp.getName().startsWith("B"))
			.collect(Collectors.toList());
	
	System.out.println("Letter starts with specific letter");
	filterEmployee.forEach(emp -> System.out.println("Name :" + emp.getName()));
	filterEmployee.forEach(System.out::println);
	System.out.println();
	
	//Employees Earning in a Given Salary Range
	List<Employees> inRangeEmployee = employees.stream()
			.filter(emp -> emp.getSalary() >= 40000 && emp.getSalary() < 70000)
			.collect(Collectors.toList());
	
	System.out.println("Range between 40000 to 70000");
	inRangeEmployee.forEach(emp -> System.out.println("ID :" + emp.getId() + " " + "Salary :" + emp.getSalary()));
	System.out.println();
	
	boolean exist = employees.stream().anyMatch(emp -> emp.getSalary() > 100000);
	System.out.println("Salary :" + exist);
	System.out.println();
	
	Map<Boolean, List<Employees>> partitioned = employees.stream()
			.collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));
	
	System.out.println("Above 50000");
	partitioned.get(true).forEach(
			emp -> System.out.println("Name :" + emp.getName() + "Salary :" + emp.getSalary()));
	
	System.out.println("Below 50000");
	partitioned.get(false).forEach(
			emp -> System.out.println("Name :" + emp.getName() + "Salary :" + emp.getSalary()));
	
	
	}

}

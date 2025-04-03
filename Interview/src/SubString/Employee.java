package SubString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private String Department;
	private Double Salary;
	
	public String getName() {
		return name;
	}
		
	public String getDepartment() {
		return Department;
	}
	
	public Double getSalary() {
		return Salary;
	}
	
	public Employee(String name, String Department, Double Salary) {
		this.name = name;
		this.Department = Department;
		this.Salary = Salary;
		}
}

class Main{
	

	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Bala","IT", 200.0),
				new Employee("Bala","CS", 300.0),
				new Employee("Bala","IT", 400.0)
				);
		
		Map<String, List<Employee>> empBySalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment)); 
	}

}

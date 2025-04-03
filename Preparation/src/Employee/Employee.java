package Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	
	private int id;
	private String name;
	private String city;
	
	

	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		city = city;
	}

	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Bala", "Chennai"),
				new Employee(2, "Moj", "Madras"),
				new Employee(3, "Diva", "Chennai"),
				new Employee(4, "Jeeva", "DVK"),
				new Employee(2, "Visu", "Madras")
				);
		
		
		// city as key and mapping a employee
		//list by city
		Map<String, List<String>> groupedByCity = employees.stream()
				.collect(Collectors.groupingBy(
						Employee :: getCity, 
						Collectors.mapping(Employee :: getName, Collectors.toList())));
		
		groupedByCity.forEach((city, names) -> 
			System.out.println("Employee in city : " +city + names));
			System.out.println();
		
		//Find Employees from a Specific City with ID
		List<Employee> employeeCity = employees.stream()
				.filter(emp -> "Chennai".equals(emp.getCity()))
				.collect(Collectors.toList());
		
		if(!employeeCity.isEmpty()) {
			List<String> names = employeeCity.stream()
					.map(emp -> emp.getName() + " " +"(" + emp.getId() + ")").collect(Collectors.toList());
			System.out.println("Native : " + names);
		}else {
			System.out.println("No employee was found");
		}
		
		
		System.out.println();
		
		// Find Duplicate Cities
		
		Map<String, Long> cityCounts = employees.stream()
				.collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
		System.out.println("Counting -> " + cityCounts);
		
		
		

	}
}



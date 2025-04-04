package Stream;

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
	
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Employee{id = "+ id +", name ='"+ name + '\'' + ", city = '" + city +"'}";
	}
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Bala", "DVK"),
				new Employee(2, "Kumar", "KKDI"),
				new Employee(3, "Moj", "DVK"),
				new Employee(4, "Jeeva", "DVK"),
				new Employee(5, "Vishva", "CHN"),
				new Employee(6, "Diva", "Madras")
				);
		
		// Groups employee by city
		Map<String, List<Employee>> employeeByCity = employees.stream()
				.collect(Collectors.groupingBy(Employee::getCity));	
				Collectors.mapping(Employee::getName, Collectors.toList());
				System.out.println(employeeByCity + "\n");
		
		
		employeeByCity.forEach((city, names) ->
			System.out.println(city + names + "\n"));
		
		
//		employeeByCity.entrySet().stream()
//		.sorted((a,b) ->  Integer.compare(b.getValue().size(), b.getValue().size()))
//		.forEach(entry -> 
//			System.out.println(entry.getValue() + entry.getValue());
	}
		}


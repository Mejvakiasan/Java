package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Student {
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	
	
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Bala", 75),
				new Student("Moj", 85),
				new Student("Visu", 95),
				new Student("Jeeva", 97),
				new Student("Diva", 90));
					
		//Print names of students who scored more than 75.
		System.out.println("List students scored more than 75");
		students.stream()
				.filter(s -> s.getMarks()>75).map(Student::getName)
				.forEach(System.out::println);
		
		//Find the average marks of all students.
		double avgMarks = students.stream()
				.mapToInt(Student::getMarks)
				.average()
				.orElse(0.0);
		System.out.println("\nAverage mark:" + avgMarks);
		
		//Print the name of the student with the highest marks.
		Optional<Student> topStudent = students.stream()
				.max(Comparator.comparing(Student::getMarks));
		
		topStudent.ifPresent(s -> 
		System.out.println("\nTop student: " + 
		s.getName() + " with " + s.getMarks() + " marks"));
	}

}

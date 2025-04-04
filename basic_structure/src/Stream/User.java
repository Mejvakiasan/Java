package Stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class User {
	
	int id;
	String name;
	LocalDate transactionDate;	
	double transactionAmmount;

	

	public User(int id, String name, LocalDate transactionDate, double transactionAmmount) {
		this.id = id;
		this.name = name;
		this.transactionDate = transactionDate;
		this.transactionAmmount = transactionAmmount;
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



	public LocalDate getTransactionDate() {
		return transactionDate;
	}



	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}



	public double getTransactionAmmount() {
		return transactionAmmount;
	}



	public void setTransactionAmmount(double transactionAmmount) {
		this.transactionAmmount = transactionAmmount;
	}

	


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", transactionDate=" + transactionDate + ", transactionAmmount="
				+ transactionAmmount + "]";
	}

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User (1, "Bala", LocalDate.now(), 500.0),
				new User (2, "Kumar", LocalDate.now(), 200.0),
				new User (3, "Jeeva", LocalDate.now(), 350.0),
				new User (4, "Moj", LocalDate.now(), 700.0),
				new User (5, "Diva", LocalDate.now(),8500.0));
		
		//Todays's transaction
		LocalDate today = LocalDate.now();
		List<User> todaysTransaction = users.stream()
				.filter(user -> user.getTransactionDate().equals(today))
				.collect(Collectors.toList());
		
//		todaysTransaction.stream()
//		.max(Comparator.comparingDouble(user -> user.transactionAmmount))
//		.ifPresent(System.out::println);
		
		//top 3 transaction
		List<User> topTransaction = todaysTransaction.stream()
				.sorted(Comparator.comparingDouble(User::getTransactionAmmount).reversed())
				.limit(3).collect(Collectors.toList());
		
		topTransaction.forEach(System.out::println);
		
		
		
		// Highest transaction of today
		Optional<User> highestTransaction = todaysTransaction.stream()
				.max(Comparator.comparingDouble(user -> user.transactionAmmount));
		
		highestTransaction.ifPresent(user -> 
		System.out.println("\n" + "Highest :" + user));
		
		
		
		
		
		// highest transaction of today orelse print default message
//		User highestTransactions = todaysTransaction.stream()
//				.max(Comparator.comparingDouble(user -> user.transactionAmmount))
//				.orElse(null);
//		
//		if(highestTransactions != null) {
//			System.out.println("high" + highestTransactions);
//		}else {
//			System.out.println("No transaction found");
//		}
		
		
	}
}


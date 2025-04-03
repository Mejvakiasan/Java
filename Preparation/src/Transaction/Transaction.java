package Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Transaction {
	
	private int id;
	private String name;
	private double account;
	private LocalDate date;
	
	public Transaction(int id, String name, double account, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.date = date;
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

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", name=" + name + ", account=" + account + ", date=" + date + "]";
	}
	
	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
				new Transaction(1, "Bala", 200, LocalDate.now()),
				new Transaction(2, "Moj", 300, LocalDate.now()),
				new Transaction(3, "Visu", 400, LocalDate.now()),
				new Transaction(4, "Diva", 500, LocalDate.now().minusDays(1)),
				new Transaction(5, "Jeeva", 600, LocalDate.now())
				);
				
		LocalDate today = LocalDate.now();
		
		 // Filter today's transactions
		List<Transaction> todaysTransaction = transactions.stream()
				.filter(t -> t.getDate().equals(today))
				.collect(Collectors.toList());
		
		todaysTransaction.forEach(t -> System.out.println("Today's Transaction :" + t.getName()+ " " + t.getDate()+ " " + t.getAccount()));
		System.out.println();
		
		// Find the highest transaction of the day
		Optional<Transaction> highestTransaction = transactions.stream()
				.max(Comparator.comparingDouble(Transaction::getAccount));
		highestTransaction.ifPresent(t -> System.out.println("Highest Transaction :" + t));
		
		
		
	}
}

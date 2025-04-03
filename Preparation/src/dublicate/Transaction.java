package dublicate;

import java.util.LinkedList;
import java.util.Queue;

public class Transaction {
	
	private String customerName;
	private String type;
	private double ammount;
	
	

	public Transaction(String customerName, String type, double ammount) {
		this.customerName = customerName;
		this.type = type;
		this.ammount = ammount;
	}
	

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getAmmount() {
		return ammount;
	}


	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	

	@Override
	public String toString() {
		return "Transaction [customerName=" + customerName + ", type=" + type + ", ammount=" + ammount + "]";
	}

	 public void processTransaction() {
	        System.out.println("Processing Transaction: " + type + " of $" + ammount + " for " + customerName);
	    }
	
	public static void main(String[] args) {
		Queue<Transaction> transactionQueue = new LinkedList<>();
		
		transactionQueue.offer(new Transaction("Bala", "Deposit", 100));
		transactionQueue.offer(new Transaction("moj", "Withdraw", 300));
		transactionQueue.offer(new Transaction("Jeeva", "Transfer", 400));
		
		while(!transactionQueue.isEmpty()) {
			Transaction txn = transactionQueue.poll();
			txn.processTransaction();
		}
		System.out.println("successful...");

	}

}

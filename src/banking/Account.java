package banking;

public class Account {
	
	private static int nextId = 1;
	private int id;
	private String description;
	private double balance;
	
	public void deposit(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be GT zero");
		}
		setBalance(getBalance() + amount);
	}
	public void withdraw(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be GT zero");
		}
		if(amount > balance) {
			throw new Exception("Insufficient funds!");
		}
		setBalance(getBalance() - amount);
	}
	public void transfer(Account toAccount, double amount) throws Exception {
		withdraw(amount);
		toAccount.deposit(amount);
	}
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String description) {
		this.id = nextId++;
		this.description = description;
		this.balance = 0;
	}
	public Account() {
		this("New Account");
	}
}

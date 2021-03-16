package banking;

public class SavingsComp {
	
	private Account account = null;
	private double intRate = 0.12;
	
	public void deposit(double amount) throws Exception {
		account.deposit(amount);
	}
	public void withdraw(double amount) throws Exception {
		account.withdraw(amount);
	}
	public void transfer(Account toAccount, double amount) throws Exception {
		account.transfer(toAccount, amount);
	}
	public void payInterest(int months) throws Exception {
		double interest = getBalance() * (intRate / 12) * months;
		deposit(interest);
	}
	public int getId() { return account.getId(); }
	public String getDescription() { return account.getDescription(); }
	public void setDescription(String description) { account.setDescription(description); }
	public double getBalance() { return account.getBalance(); }
	public double getIntRate() { return intRate; }
	public void setIntRate(double intRate) { this.intRate = intRate; }

	public SavingsComp(String description) {
		account = new Account(description);		
	}
	public SavingsComp() {
		this("New Savings Account");
	}

}

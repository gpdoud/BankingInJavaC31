package banking;

public class Savings extends Account {
	
	private double intRate = 0.12;
	
	public double getIntRate() { return intRate; }
	public void setIntRate(double intRate) { this.intRate = intRate; }
	
	public void payInterest(int months) throws Exception {
		double interest = getBalance() * (intRate / 12) * months;
		deposit(interest);
	}

	public Savings(String description) {
		super(description);
	}

	public Savings() {
		this("New Savings");
	}

}

package mainline;

import banking.Savings;

public class Program {

	public static void main(String[] args) {

		Savings s1 = new Savings("My Savings Account");
		try {
			s1.deposit(125);
			s1.withdraw(25);
			s1.payInterest(3);
			System.out.printf("Bal: %f\n", s1.getBalance());
			s1.withdraw(1000);
		} catch (Exception ex) {
			System.out.printf("%s", ex.getMessage());
		}
	}

}

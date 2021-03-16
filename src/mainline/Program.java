package mainline;

import banking.Savings;
import banking.SavingsComp;

public class Program {

	public static void main(String[] args) {

		Savings s1 = new Savings("My Savings Account");
		SavingsComp sc1 = new SavingsComp("My 2nd Savings Account");
		try {
			s1.deposit(125);
			s1.withdraw(25);
			s1.payInterest(3);
			System.out.printf("\nBal: %f", s1.getBalance());
			//s1.withdraw(1000);
			//s1.deposit(-100);
			s1.withdraw(-100);
		} catch (Exception ex) {
			System.out.printf("\n%s", ex.getMessage());
		}			
		try {
			sc1.deposit(125);
			sc1.withdraw(25);
			sc1.payInterest(3);
			System.out.printf("\nBal: %f", sc1.getBalance());
			//sc1.withdraw(1000);
			//sc1.deposit(-100);
			sc1.withdraw(-100);
		} catch (Exception ex) {
			System.out.printf("\n%s", ex.getMessage());
		}
	}

}

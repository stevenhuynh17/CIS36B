//Steven Huynh
//CIS 36B 34090
//Assignment 4
//Due 2/10/2017
//Submitted 2/15/2017

package Exercise1;

public class SavingsAccount {
	static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}
	
	double calculateMonthlyInterest(double rate) {
		return (savingsBalance * rate / 12) + savingsBalance;
	}
	
	static void modifyInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	void deposit(double amount) {
		savingsBalance += amount;
	}
	
	void withdraw(double amount) {
		savingsBalance -= amount;
	}

	// GETTERS AND SETTERS
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void checkBalance(double total) {
		// TODO Auto-generated method stub
		if(total > 10000){
			this.annualInterestRate = 0.10;
		} else {
			this.annualInterestRate = 0.04;
		}		
	}
}

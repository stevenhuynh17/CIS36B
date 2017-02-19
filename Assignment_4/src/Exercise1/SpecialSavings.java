//Steven Huynh
//CIS 36B 34090
//Assignment 4
//Due 2/10/2017
//Submitted 2/15/2017

package Exercise1;

public class SpecialSavings extends SavingsAccount {
	double annualInterestRate;  
	
	public SpecialSavings(double savingsBalance) {
		super(savingsBalance);
		checkBalance(savingsBalance);
	}
	
	public void checkBalance(double total) {
		if(total > 10000){
			this.annualInterestRate = 0.10;
		} else {
			this.annualInterestRate = 0.04;
		}
	
		
	}

}

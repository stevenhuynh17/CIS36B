//Steven Huynh
//CIS 36B 34090
//Assignment 4
//Due 2/10/2017
//Submitted 2/15/2017

package Exercise1;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int option = 0;
		double amount;
		
		Scanner option_selection = new Scanner(System.in); 
		SpecialSavings saver1 = new SpecialSavings(12000.00);
		SpecialSavings saver2 = new SpecialSavings(3000.00);
		
		System.out.printf("CURRENT INTEREST RATE: %.2f%%\n", saver1.annualInterestRate * 100);
		System.out.printf("NEW BALANCE for SAVER1 at INTEREST: $%.2f\n", saver1.calculateMonthlyInterest(saver1.annualInterestRate));

		System.out.printf("CURRENT INTEREST RATE: %.2f%%\n", saver2.annualInterestRate * 100);
		System.out.printf("NEW BALANCE for SAVER2 at INTEREST: $%.2f\n\n", saver2.calculateMonthlyInterest(saver2.annualInterestRate));
		
		System.out.printf("Welcome to the Bank\n");
		while(option != 4) {
			System.out.printf("1) DEPOSIT\n"
					+ "2) WITHDRAW\n"
					+ "3) BALANCE\n"
					+ "4) EXIT\n"
					+ "SELECT: ");
			option = option_selection.nextInt();
			
			if(option == 1) {
				System.out.printf("How many? ");
				amount = option_selection.nextInt();
				saver2.deposit(amount);
				saver2.checkBalance(saver2.getSavingsBalance());
				printInfo(saver2);
			} else if(option == 2) {
				System.out.printf("How many? ");
				amount = option_selection.nextInt();
				saver2.withdraw(amount);
				saver2.checkBalance(saver2.getSavingsBalance());
				printInfo(saver2);
			} else if(option == 3) {
				System.out.printf("Current Balance: $%.2f\n\n", saver2.getSavingsBalance());
			} else if(option == 4) {
				System.out.printf("Goodbye");
				System.exit(0);
			} else {
				System.out.printf("Please try again\n\n");
			}
		}
		
	}
	
	static void printInfo(SpecialSavings saver2) {
		System.out.printf("\nNEW BALANCE: %.2f\n", saver2.getSavingsBalance());
		System.out.printf("INTEREST RATE: %.2f%%\n", saver2.annualInterestRate * 100);
		System.out.printf("WITH MONTHLY INTEREST: %.2f\n\n", saver2.calculateMonthlyInterest(saver2.annualInterestRate));
	}
}

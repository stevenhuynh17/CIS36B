import java.util.*;

public class SalesApp {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		double totalSales [][][] = new double [3][3][3];
		// Create a menu for user to select option
		EnterData(user_input, totalSales);
		ShowMenu(user_input);
		// Header showing your project description.
		// Menu of services (Load data, opt1, opt2, opt3, end)
	}
	
	public static void ShowMenu(Scanner user_input) {
		int option_selection = 0;
	
		
		while(option_selection != 4) {
			System.out.printf("Welcome, please select one of the following options: "
					+ "\n1) Product Sales"
					+ "\n2) Quarter Sales"
					+ "\n3) Geography Sales"
					+ "\n4) Exit"
					+ "\n SELECT: ");
			// What happens if user accidentally input a string?
			option_selection = user_input.nextInt();
			
			if(option_selection == 1) {
				TotalSalesByProduct();
			} else if(option_selection == 2) {
				TotalSalesByQuarter();
			} else if(option_selection == 3) {
				TotalSalesByGeography();
			} else if(option_selection == 4) {
				break;
			} else {
				System.out.printf("Please try again\n\n");
			}
		}
		System.out.printf("Goodbye!");
		EndProgram();
	}
	
	public static void EnterData(Scanner user_input, double[][][] totalSales) {
		String regions [] = {"West", "North", "South"};
		
		for(int i=0; i < totalSales[0].length; i++) {
			System.out.printf("Enter total GTX sold for q" + (i + 1) + ": ");
			totalSales[0][i][0] = user_input.nextDouble();
			for(int j=0; j < totalSales[0][0].length; j++) {
				System.out.printf("Enter total GTX sold for region " + regions[j] + ": ");
				totalSales[0][i][j] = user_input.nextDouble();
			}
			System.out.printf("\n");
		}
		
		for(int i=0; i < totalSales[0].length; i++) {
			System.out.printf("Enter total Titan sold for q" + (i + 1) + ": ");
			totalSales[1][i][0] = user_input.nextDouble();
			for(int j=0; j < totalSales[1][0].length; j++) {
				System.out.printf("Enter total Titan sold for region " + regions[j] + ": ");
				totalSales[1][i][j] = user_input.nextDouble();
			}
			System.out.printf("\n");
		}
		
		for(int i=0; i < totalSales[0].length; i++) {
			System.out.printf("Enter total 1080ati sold for q" + (i + 1) + ": ");
			totalSales[2][i][0] = user_input.nextDouble();
			for(int j=0; j < totalSales[2][0].length; j++) {
				System.out.printf("Enter total 1080ati sold for region " + regions[j] + ": ");
				totalSales[2][i][j] = user_input.nextDouble();
			}
			System.out.printf("\n");
		}
		
		System.out.printf("TOTAL SALES: " + Arrays.deepToString(totalSales) + "\n\n");
	}
	
	public static void TotalSalesByProduct() {
		System.out.println("1");
	}
	
	public static void TotalSalesByQuarter() {
		System.out.printf("2");
	}
	
	public static void TotalSalesByGeography() {
		System.out.printf("3");
	}
	
	public static void EndProgram() {
		System.exit(0);
	}
}


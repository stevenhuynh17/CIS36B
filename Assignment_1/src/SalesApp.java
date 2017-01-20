import java.util.*;

public class SalesApp {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		double totalSales [][][] = new double [3][3][3];
		// Create a menu for user to select option
		double dummyData [][][] = {
				{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}}, 
				{{4.0, 4.0, 4.0}, {5.0, 5.0, 5.0}, {6.0, 6.0, 6.0}}, 
				{{7.0, 7.0, 7.0}, {8.0, 8.0, 8.0}, {9.0, 9.0, 10.0}}
		};
		
		int option_selection = 0; 
		
		while(option_selection != 3) {
			System.out.printf("The following program allows users to calculate sales for up to 3 products by quarter, geography and per product.\n\n");
			System.out.printf("Would you like to manually input data or use dummy data?"
					+ "\n 1) Dummy Data"
					+ "\n 2) Input Data"
					+ "\n 3) EXIT"
					+ "\n SELECT: ");
			option_selection = user_input.nextInt();
			
			if(option_selection == 1) {
				ShowMenu(user_input, dummyData);
			} else if(option_selection == 2) {
				EnterData(user_input, totalSales);
				ShowMenu(user_input, totalSales);
			} else if(option_selection == 3) {
				System.out.printf("Goodbye.\n");
				EndProgram();
			} else {
				System.out.printf("Invalid selection. Please try again\n");
			}
		}
	}
	
	public static void ShowMenu(Scanner user_input, double totalSales[][][]) {
		int option_selection = 0;
	
		while(option_selection != 5) {
			System.out.printf("\nWelcome, please select one of the following options: "
					+ "\n 1) Product Sales"
					+ "\n 2) Quarter Sales"
					+ "\n 3) Geography Sales"
					+ "\n 4) Show Data"
					+ "\n 5) Exit"
					+ "\n SELECT: ");
			// What happens if user accidentally input a string?
			option_selection = user_input.nextInt();
			
			if(option_selection == 1) {
				TotalSalesByProduct(user_input, totalSales);
			} else if(option_selection == 2) {
				TotalSalesByQuarter(user_input, totalSales);
			} else if(option_selection == 3) {
				TotalSalesByGeography(user_input, totalSales);
			} else if(option_selection == 4) {
				System.out.printf("Current Data: " + Arrays.deepToString(totalSales) + "\n");
			} else if(option_selection == 5) {
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
		String products [] = {"GTX", "Titan", "1080ati"};
		
		for(int product=0; product < products.length; product++) {
			for(int i=0; i < totalSales[0].length; i++) {
				for(int j=0; j < totalSales[0][0].length; j++) {
					System.out.printf("Enter total " + products[product] + " sold for region " + regions[j] + " during q" + (i + 1) + ": ");
					totalSales[product][i][j] = user_input.nextDouble();
				}
				System.out.printf("\n");
			}
		}
	}
	
	public static void TotalSalesByProduct(Scanner user_input, double totalSales[][][]) {
		int option_selection = 0;
		
		while(option_selection != 4) {
			System.out.printf("\nWhich product? "
					+ "\n 1) GTX"
					+ "\n 2) Titan"
					+ "\n 3) 1080ati"
					+ "\n 4) BACK TO MAIN MENU"
					+ "\n SELECT: ");
			option_selection = user_input.nextInt();
			
			if(option_selection == 1) {
				System.out.printf(AddByProduct(totalSales, option_selection) + " units\n");
			} else if(option_selection == 2) {
				System.out.printf(AddByProduct(totalSales, option_selection) + " units\n");
			} else if(option_selection == 3) {
				System.out.printf(AddByProduct(totalSales, option_selection) + " units\n");
			} else if(option_selection == 4) {
				break;
			} else {
				System.out.printf("Please try again\n\n");
			}
		}
	}
	
	public static double AddByProduct(double totalSales[][][], int index) {
		double total = 0;
		for(int i=0; i < totalSales[index - 1].length; i++) {
			for(int j=0; j < totalSales[index - 1][i].length; j++) {
				total += totalSales[index - 1][i][j];
			}
		}
		return total;
	}
	
	public static void TotalSalesByQuarter(Scanner user_input, double totalSales[][][]) {
		int option_selection = 0;
		
		while(option_selection != 4) {
			System.out.printf("\nWhich Quarter? "
					+ "\n 1) q1"
					+ "\n 2) q2"
					+ "\n 3) q3"
					+ "\n 4) BACK TO MAIN MENU"
					+ "\n SELECT: ");
			option_selection = user_input.nextInt();
			
			if(option_selection == 1) {
				System.out.printf(AddByQuarter(totalSales, option_selection) + " units\n");
			} else if(option_selection == 2) {
				System.out.printf(AddByQuarter(totalSales, option_selection) + " units\n");
			} else if(option_selection == 3) {
				System.out.printf(AddByQuarter(totalSales, option_selection) + " units\n");
			} else if(option_selection == 4) {
				break;
			} else {
				System.out.printf("Please try again\n\n");
			}
		}
	}
	
	public static double AddByQuarter(double totalSales[][][], int index) {
		int total = 0;
		
		for(int i=0; i < totalSales[0].length; i++) {
			for(int j=0; j< totalSales[0][0].length; j++) {
				total += totalSales[i][index - 1][j];
			}
		}
		return total;
	}
	
	public static void TotalSalesByGeography(Scanner user_input, double totalSales[][][]) {
		int option_selection = 0;
		
		while(option_selection != 4) {
			System.out.printf("\nWhich Region? "
					+ "\n 1) West"
					+ "\n 2) North"
					+ "\n 3) South"
					+ "\n 4) BACK TO MAIN MENU"
					+ "\n SELECT: ");
			option_selection = user_input.nextInt();
			
			if(option_selection == 1) {
				System.out.printf(AddByGeography(totalSales, option_selection) + " units\n");
			} else if(option_selection == 2) {
				System.out.printf(AddByGeography(totalSales, option_selection) + " units\n");
			} else if(option_selection == 3) {
				System.out.printf(AddByGeography(totalSales, option_selection) + " units\n");
			} else if(option_selection == 4) {
				break;
			} else {
				System.out.printf("Please try again\n\n");
			}
		}
	}
	
	public static double AddByGeography(double totalSales[][][], int index) {
		double total = 0;
		for(int i=0; i < totalSales[0][0].length; i++) {
			for(int j=0; j < totalSales[0][0].length; j++) {
				total += totalSales[i][j][index - 1];
			}
		}
		return total;
	}
	
	public static void EndProgram() {
		System.exit(0);
	}
}


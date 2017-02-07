//Steven Huynh
//CIS 36B 34090
//Assignment 3
//Due 2/3/2017
//Submitted 2/3/2017


import java.util.*;
public class Store {
	private float salesbyweek[][];

	Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	float [] getsalesforentireweek(int week) {
		return salesbyweek[week];
	}
	float getsaleforweekdayintersection(int week, int day) {
		return salesbyweek[week][day];
	}
	// businessmethod
	// a. totalsalesforweek
	// b. avgsalesforweek
	// c. totalsalesforallweeks
	// d. averageweeklysales
	public void businessmethod() {
		float weekly_total = 0;
		float grand_total = 0; 
		ArrayList sales = new ArrayList();
		
		for (int i = 0; i < 5; i++)
		{
			weekly_total = 0;
			for (int j = 0; j < 7; j++)
			{
				weekly_total += salesbyweek[i][j];
			}
			grand_total += weekly_total;
			sales.add(weekly_total);
			
			System.out.printf("Tot Sales for Week %d: $%.2f \n", i+1, weekly_total);
			System.out.printf("Avg Sales for Week %d: $%.2f \n", i+1, weekly_total / 7);
			System.out.println("");
		}
		System.out.printf("Tot Sales for All Weeks: $%.2f\n", grand_total);
		System.out.printf("Avg Weekly Sales: $%.2f\n", grand_total / 5);
		System.out.printf("Week " + highest(sales).get(0) + " has the Highest Sales Amount: $" + highest(sales).get(1));
		System.out.println("");
		System.out.printf("Week " + lowest(sales).get(0) + " has the Lowest Sales Amount: $" + lowest(sales).get(1));	
	}
	
	ArrayList highest(ArrayList sales) {
		ArrayList data = new ArrayList();
		float result = (float) sales.get(0);
		data.add(1);
		data.add(result);
		
		for(int i = 1; i < sales.size(); i++) {
			
			if(result < (float) sales.get(i)){
				data.clear();
				result = (float) sales.get(i);
				data.add(i + 1);
				data.add(result);
			}
		}
		return data ; 
	}
	
	ArrayList lowest(ArrayList sales) {
		ArrayList data = new ArrayList();
		float result = (float) sales.get(0);
		data.add(1);
		data.add(result);
		
		for(int i = 1; i < sales.size(); i++) {
			
			if(result > (float) sales.get(i)){
				data.clear();
				result = (float) sales.get(i);
				data.add(i);
				data.add(result);
			}
		}
		return data ; 
	}
	

	// e. weekwithhighestsaleamt
	// f. weekwithlowestsaleamt
	// analyzeresults //call a through f
	// print()
}
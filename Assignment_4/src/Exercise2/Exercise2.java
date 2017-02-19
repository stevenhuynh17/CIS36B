//Steven Huynh
//CIS 36B 34090
//Assignment 4
//Due 2/10/2017
//Submitted 2/15/2017

package Exercise2;

public class Exercise2 {
	public static void main(String[] args) {
		Ship a1[] = new Ship[5];
		a1[0] = new Ship(12, "Discovery", 15, 100, "Wind", 1000);
		a1[1] = new CargoShip(13, "Majestic Maersk", 25, 400, "Diesel", 165000, "clothes", "container");
		a1[2] = new CruiseShip(2300, "Harmony of the Seas", 25, 362, "Diesel", 20236, 6780, 20);
		
		System.out.printf("Ship TEST type: %s\n", a1[0].crew);
		System.out.printf("Ship CARGO type: %s\n", a1[1].crew);
		System.out.printf("Ship CRUISE type: %s\n", a1[2].crew);
		
		System.out.printf("Ship CARGO cargo: %s\n", a1[1].getTypeOfCargo());
		System.out.printf("Ship CRUISE restaurants: %d\n", a1[2].getPassengers());
		
	}
}
//13, "Majestic Maersk", 25, 400, "Diesel", 165000, null, null
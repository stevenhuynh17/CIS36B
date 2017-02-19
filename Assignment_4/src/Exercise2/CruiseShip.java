//Steven Huynh
//CIS 36B 34090
//Assignment 4
//Due 2/10/2017
//Submitted 2/15/2017

package Exercise2;

public class CruiseShip extends Ship {
	int passengers; 
	int restaurants;
	
	public CruiseShip(int crew, String shipName, double speed, double length, String propulsionMethod, double tonnage,
			int passengers, int restaurants) {
		super(crew, shipName, speed, length, propulsionMethod, tonnage);
		this.passengers = passengers;
		this.restaurants = restaurants;
	}
	
	@Override
	public int getPassengers() {
		return passengers;
	}
	
	@Override
	public int getRestaurants() {
		return restaurants;
	} 

}

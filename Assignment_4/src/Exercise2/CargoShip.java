//Steven Huynh
//CIS 36B 34090
//Assignment 4
//Due 2/10/2017
//Submitted 2/15/2017

package Exercise2;

public class CargoShip extends Ship {
	String typeOfCargo; 
	String cargoShipType;
	
	public CargoShip(int crew, String shipName, double speed, double length, String propulsionMethod, double tonnage,
			String typeOfCargo, String cargoShipType) {
		super(crew, shipName, speed, length, propulsionMethod, tonnage);
		this.typeOfCargo = typeOfCargo;
		this.cargoShipType = cargoShipType;
	}
	
	@Override
	public String getTypeOfCargo() {
		return typeOfCargo;
	}

	@Override
	public String getCargoShipType() {
		return cargoShipType;
	}

	

}

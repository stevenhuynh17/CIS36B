//Steven Huynh
//CIS 36B 34090
//Assignment 3
//Due 2/3/2017
//Submitted 2/3/2017

public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
//		System.out.printf("TESTING: " + stores[i]);
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
}

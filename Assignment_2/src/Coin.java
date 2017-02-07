// Steven Huynh
// CIS 36B 34090
// Assignment 2
// Due 1/27/2017
// Submitted 1/27/2017

import java.util.*;

public class Coin {
	private String sideUp;
	
	
	public Coin() {
		super();
		this.sideUp = sideUp;
	}

	String getSideUp() {
		return this.sideUp;
	}
	
	void toss() {
		Random rand = new Random();
		int n = rand.nextInt(100);
		
		if(n % 2 == 0) {
			this.sideUp = "HEADS";
		} else {
			this.sideUp = "TAILS";
		}
	}
	
	void generateFlips() {
		int tossCount = 0; 
		int headCount = 0;
		int tailCount = 0;
		
		for(int i=0; i<20; i++) {
			this.toss();
			System.out.printf("FLIPPED -----> %s\n", this.sideUp);
			if(this.sideUp == "HEADS") {
				headCount++;
			} else {
				tailCount++;
			}
			tossCount++;
		}
		
		System.out.printf("\nTOSSES THROWN: %d"
				+ "\nHEADS: %d"
				+ "\nTAILS: %d"
				, tossCount, headCount, tailCount);
	}

	public void setSideUp(String sideUp) {
		this.sideUp = sideUp;
	}
	
	
}

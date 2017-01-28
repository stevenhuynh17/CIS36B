import java.util.*;

public class Coin {
	void toss() {
		Random rand = new Random();
		int n = rand.nextInt(100);
		
		if(n % 2 == 0) {
			System.out.printf("VALUE: %d, HEADS\n", n);
		} else {
			System.out.printf("VALUE: %d, TAILS\n", n);
		}
		
	}
}

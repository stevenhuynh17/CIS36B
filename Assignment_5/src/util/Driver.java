
public class Driver {
	public static void main(String[] args) {
		Student lab2 [] = new Student[40];
		//Populate the student array
		lab2 = Util.readFile("/Users/StevenH/Desktop/Projects/cis36B/Assignment_5/src/data.txt", lab2);
		Statistics statlab2 = new Statistics();
		statlab2.findlow(lab2);
		statlab2.findhigh(lab2);
		statlab2.findavg(lab2);
		//add calls to find high and find average
		//Print the data and statistics
	}
}

package driver;
import adapter.*;
import db.*;

public class Driver {
	//Create helper methods to setup StudentGrade array and write objects to disk.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Part 1
		String file = "/Users/StevenH/Desktop/Projects/cis36B/Assignment_6/src/data.txt";
		
		ReportCard rc = new PublicAPI(); // Creates an instance of PublicAPI		
		GCInterface test = new StudentGrade(null, null);
		
		//Part 2
		rc.buildStudentGrade(file); // Process the text file
		rc.printStudentScores(1234);
		rc.printStudentStatistics();
		System.out.println();
		rc.printStudentScores(2134);
		rc.printStudentStatistics();
	}

}

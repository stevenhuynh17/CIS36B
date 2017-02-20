import java.util.Arrays;

public class Statistics {
	int [] lowscores = new int [5];
	int [] highscores = new int [5];
	float [] avgscores = new float [5];
	
	void findlow(Student [] a){
		/*This method will find the lowest score and store it in an   array names lowscores. */
		// Cycle through all the students
			// Access the scores and put one for each quiz category
		for(int score=0, index=0; score<a[0].getScores().length; score++, index++) {
			int lowest = a[0].getScores()[score];
			for(int student=0; student<a.length; student++) {
				if(a[student] == null) {
					break;
				} else if (lowest > a[student].getScores()[score]) {
					lowest = a[student].getScores()[score];
				}
			}
			lowscores[index] = lowest; 
		}
		System.out.println("LOW SCORES: " + Arrays.toString(lowscores));
	}
	void findhigh(Student [] a){
		/* This method will find the highest score and store it in an     array names highscores. */
		for(int score=0, index=0; score<a[0].getScores().length; score++, index++) {
			int highest = a[0].getScores()[score];
			for(int student=0; student<a.length; student++) {
				if(a[student] == null) {
					break;
				} else if (highest < a[student].getScores()[score]) {
					highest = a[student].getScores()[score];
				}
//				System.out.println((a[student].getScores()[0]));
			}
			highscores[index] = highest; 
		}
		System.out.println("HIGH SCORES: " + Arrays.toString(highscores));
	}
	void findavg(Student [] a){
		/* This method will find avg score for each quiz and store it in an array names avgscores. */
		for(int score=0, index=0; score<a[0].getScores().length; score++, index++) {
			float average = 0;
			for(int student=0; student<a.length; student++) {
				if(a[student] == null) {
					average = average / student;
					break;
				} else {
					average += a[student].getScores()[score]; 
				}
			}
			
			avgscores[index] = (float) (Math.round(average * 100) / 100.0);
		}
		System.out.println("AVG SCORES: " + Arrays.toString(avgscores));
	}
	//add methods to print values of instance variables.
}

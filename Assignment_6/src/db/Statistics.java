package db;

import java.io.Serializable;
import java.util.Arrays;

public class Statistics implements Serializable{
	private int [] lowscores = new int [5];
	private int [] highscores = new int [5];
	private float [] avgscores = new float [5];
		
	public void findlow(StudentGrade [] a){
		/*This method will find the lowest score and store it in an   array names lowscores. */
		// Cycle through all the students
			// Access the scores and put one for each quiz category
		for(int score=0, index=0; score<a[0].getStu().getScores().length; score++, index++) {
			
			int lowest = a[0].getStu().getScores()[score];
			for(int student=0; student<a.length; student++) {
				
				if(a[student] == null) {
					break;
				} 
				int comparison = a[student].getStu().getScores()[score];
				if (lowest > comparison) {
					lowest = a[student].getStu().getScores()[score];
				}
				
			}
			lowscores[index] = lowest; 
//			System.out.println("LowScores: " + Arrays.toString(lowscores));
		}
	}
	
	public void findhigh(StudentGrade [] a){
		/* This method will find the highest score and store it in an     array names highscores. */
		for(int score=0, index=0; score<a[0].getStu().getScores().length; score++, index++) {
			int highest = a[0].getStu().getScores()[score];
			for(int student=0; student<a.length; student++) {
				if(a[student] == null) {
					break;
				} else if (highest < a[student].getStu().getScores()[score]) {
					highest = a[student].getStu().getScores()[score];
				}
//				System.out.println((a[student].getScores()[0]));
			}
			highscores[index] = highest; 
		}
	}
	public void findavg(StudentGrade [] a){
		/* This method will find avg score for each quiz and store it in an array names avgscores. */
		for(int score=0, index=0; score<a[0].getStu().getScores().length; score++, index++) {
			float average = 0;
			for(int student=0; student<a.length; student++) {
				if(a[student] == null) {
					average = average / student;
					break;
				} else {
					average += a[student].getStu().getScores()[score]; 
				}
			}
			
			avgscores[index] = (float) (Math.round(average * 100) / 100.0);
		}
	}
	//add methods to print values of instance variables.

	public int[] getLowscores() {
		return lowscores;
	}

	public int[] getHighscores() {
		return highscores;
	}

	public float[] getAvgscores() {
		return avgscores;
	}
	
	
	
}

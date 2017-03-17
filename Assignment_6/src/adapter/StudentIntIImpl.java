package adapter;

import java.util.Arrays;

import db.*;
import util.Util;
public abstract class StudentIntIImpl implements ReportCard {
	//create a variable here that holds StudentGrade.
	private StudentGrade [] a1 = new StudentGrade[40];
	
	public void buildStudentGrade(String file) {
		//Read data from text file a1
		//Compute Statistics
		//array of 40 StudentGrade object is ready to be used.
		a1 = Util.readFile(file, a1);
		
	}
	
	public void printStudentStatistics() {
		
//		System.out.println("Class low scores: " + Arrays.toString(a1));
		System.out.println("Lowest: " + Arrays.toString(a1[0].getStat().getLowscores()));
		System.out.println("Highest: " + Arrays.toString(a1[0].getStat().getHighscores()));
		System.out.println("Average: " + Arrays.toString(a1[0].getStat().getAvgscores()));
	}
	
	public void printStudentScores(int id) {
		StudentGrade stu = null;
		//go through a1 (StudentGrade array) and print the values.
		//find and print.
		stu = Util.deserialize(id);
		System.out.println("Scores for student " + id + ": " + Arrays.toString(stu.getStu().getScores()));
	}
}

package db;

import java.io.*;

import adapter.GCInterface;

public class StudentGrade implements Serializable, GCInterface{
	private Student stu;
	private Statistics stat;
	public StudentGrade(Student stu, Statistics stat) {
		this.stu = stu;
		this.stat = stat;
	}
	public void print()
	{
		System.out.println("IT CAN PRINT");
		if(DEBUG==true)
		{
			//call the print methods of classes used for instance variables.
		}	
	}
	
	//add any other methods as you see fit.
	
	public Student getStu() {
		return stu;
	}
	public Statistics getStat() {
		return stat;
	}
	
}

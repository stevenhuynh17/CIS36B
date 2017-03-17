package db;
import adapter.*;

public class Courses {
	private ReportCard course = new PublicAPI(); 
	private String file;
	private String courseName; 
	
	public Courses(String file, String name) {
		this.course = course;
		this.file = file;
		this.courseName = name;
	}
	
	public void buildClassroom() {
		System.out.println(this.file);
		this.course.buildStudentGrade(this.file);
	}

	public ReportCard getCourse() {
		return course;
	}

	public String getCourseName() {
		return courseName;
	}
	 
	// getter and setter for student object
	// compute statistics
	// populating the array from a file. 
	
}

// Steven Huynh
// CIS 36B 34090
// Assignment 2
// Due 1/27/2017
// Submitted 1/27/2017

import java.util.*;

public class Part_1 {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
//		String name = user_input.nextLine(); 
		System.out.printf("Welcome to De Anza, please register as a new student."
				+ "\nPlease have information about your name, address, age and phone number ready. \n\n");
		createProfile(user_input);
		testCases();
	}
	
	public static void createProfile(Scanner user_input) {
		System.out.printf("NAME: ");
		Student name = new Student(user_input.nextLine());
		System.out.printf("ADDRESS: ");
		name.setAddress(user_input.nextLine());
		System.out.printf("AGE: ");
		name.setAge(user_input.nextLine());
		System.out.printf("PHONE#: ");
		name.setPhone(user_input.nextLine());
		
		System.out.printf("\nThe following profile has been created: \n");
		System.out.printf("NAME: %s "
				+ "\nADDRESS: %s"
				+ "\nAGE: %s"
				+ "\nPHONE#: %s\n\n"
				, name.getName(), name.getAddress(), name.getAge(), name.getPhone());
	}
	
	public static void testCases() {
		Student test_1 = new Student("STEVEN");
		test_1.setAddress("TEST");
		test_1.setAge("100");
		test_1.setPhone("1234");
		System.out.printf("TESTING PROFILE_1: \n");
		System.out.printf("NAME: %s "
				+ "\nADDRESS: %s"
				+ "\nAGE: %s"
				+ "\nPHONE#: %s\n\n"
				, test_1.getName(), test_1.getAddress(), test_1.getAge(), test_1.getPhone());
		Student test_2 = new Student("KEVIN");
		test_2.setAddress("WORKS");
		test_2.setAge("18");
		test_2.setPhone("0987");
		System.out.printf("TESTING PROFILE_2: \n");
		System.out.printf("NAME: %s "
				+ "\nADDRESS: %s"
				+ "\nAGE: %s"
				+ "\nPHONE#: %s\n\n"
				, test_2.getName(), test_2.getAddress(), test_2.getAge(), test_2.getPhone());
	}

}

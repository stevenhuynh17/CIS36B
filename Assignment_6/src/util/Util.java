package util;

import java.io.*;

import java.util.*;

import db.*;

public class Util implements Serializable {
	//Add additional methods for serialization.
	//figure out the signature for these two methods.
	//read an object 
	//write an object
	public static StudentGrade [] readFile(String filename, StudentGrade[] a1) {
		//Reads the file and builds student array.
		// Try catch clause checks for exceptions
		try {
			//Open the file using FileReader Object.
			FileReader file = new FileReader(filename); 
			BufferedReader buff = new BufferedReader(file);
			
			boolean eof = false; 
			boolean header = true; 
			int index = 0;
			Statistics data = new Statistics();
			
			while (!eof) {
				//In a loop read a line using readLine method.
				String line = buff.readLine();
				if (line == null) {
					eof = true; 
				} else if(header == true) {
					
					header = false;
					continue;
				} else {
					//Tokenize each line using StringTokenizer Object
					StringTokenizer st = new StringTokenizer(line);
					
					Student undergrad = new Student();
					

					while(st.hasMoreTokens()) {
						
						undergrad.setSID(Integer.parseInt(st.nextToken()));
						
						int results[] = new int[5];
						for(int j=0; j<results.length; j++) {
							results[j] = Integer.parseInt(st.nextToken());	
						}
						undergrad.setScores(results);	
					}
					
					a1[index] = new StudentGrade(undergrad, data);
//					serialize(undergrad.getSID(), a1[index]);
					index++;
				}
			}
			buff.close();
			computeStatistics(a1);
			
			System.out.println("File Read");
			serialize(a1);
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		
//		
		
		//Value is then saved in the right property of Student Object.	
		return a1;
	}
	
	public static void computeStatistics(StudentGrade [] a1) {
		for(int i = 0; i < a1.length; i++) {
			if(a1[i] == null) {
				break;
			}
			a1[i].getStat().findlow(a1);
			a1[i].getStat().findhigh(a1);
			a1[i].getStat().findavg(a1);
		}
	}
	
	public static void serialize(StudentGrade [] a1) {
		try {
			
//			System.out.println("INSIDE SERIALIZING: " + stu.getSID());
			for(int i = 0; i < a1.length; i++) {
				if(a1[i] == null) {
					break;
				}
				
				int identification = a1[i].getStu().getSID(); 
				ObjectOutputStream test = new ObjectOutputStream(new FileOutputStream("studentData_" + identification + ".dat"));
				test.writeObject(a1[i]);
				System.out.printf("Successfully written %d to disk!\n", identification);
				test.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static StudentGrade deserialize(int ID) {
		StudentGrade stu = null;
		try {
			FileInputStream fileIn = new FileInputStream("studentData_" + ID + ".dat");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			stu = (StudentGrade) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		System.out.println("\nDeserializing"
				+ " Student: " + ID);
		System.out.println();
		
		
		return stu;
	}
}

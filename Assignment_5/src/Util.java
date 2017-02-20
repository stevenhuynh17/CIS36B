import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Util {
	static Student [] readFile(String filename, Student [] stu) {
		//Reads the file and builds student array.
		try {
			//Open the file using FileReader Object.
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			
			
			boolean eof = false; 
			boolean header = true; 
			int index = 0;
			
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
					
					stu[index] = new Student();
					
					while(st.hasMoreTokens()) {
						stu[index].setSID(Integer.parseInt(st.nextToken()));
						int results[] = new int[5];
						for(int j=0; j<results.length; j++) {
							results[j] = Integer.parseInt(st.nextToken());	
						}
						stu[index].setScores(results);	
					}
					index++;
				}
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		
		//Value is then saved in the right property of Student Object.	
		return stu;
	}
}

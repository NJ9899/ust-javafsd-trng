package day4_set2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		
		String data = "This is the data in the output file";
		
		try {
			//creates a FileWriter
			FileWriter file = new FileWriter("output.txt");
			
			//creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);
			
			//writes the string to the file
			output.write(data);
			
			//closes the writer
			output.close();
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}

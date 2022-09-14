package day4_set2;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader_BufferedReader {

	public static void main(String[] args) {
		
		//creates an array of character
		char[] array = new char[100];
		
		try {
			//creates a FileReader
			FileReader file = new FileReader("input.txt");
			
			//creates a FileReader
			BufferedReader input = new BufferedReader(file);
			
			//reads characters
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			
			//closes the reader
			input.close();
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}

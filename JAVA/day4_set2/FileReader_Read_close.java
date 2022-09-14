package day4_set2;

//importing the FileReader class
import java.io.FileReader;

public class FileReader_Read_close {

	public static void main(String[] args) {
		
		char[] array = new char[100];//{'a','b','c'};
		
		try {
			
			//creates a reader using the FileReader
			FileReader input = new FileReader("newFile.txt");
			
			//reads characters
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			
			//closes the reader
			//input.close();
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}

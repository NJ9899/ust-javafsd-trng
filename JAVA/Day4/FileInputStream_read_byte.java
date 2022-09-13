package day4_set2;

import java.io.FileInputStream;

public class FileInputStream_read_byte {

	public static void main(String[] args) {
		
		try {
			FileInputStream input = new FileInputStream("input1.txt");
			
			System.out.println("Data in the file");
			
			//reads the first byte
			int i=input.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				
				//reads next byte from the file
				i= input.read();
			}
			input.close();
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}

package day4_set2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStream_FileInputStream {

	public static void main(String[] args) {
		
		try {
			
			//creates a FileInputStream
			FileInputStream f = new FileInputStream("input.txt");
			
			//creates a BufferedInputStream
			BufferedInputStream b = new BufferedInputStream(f);
			
			//reads first byte from file
			int i=b.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				
				//reads next byte from the file
				i=b.read();
			}
			b.close();
		}
		
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}

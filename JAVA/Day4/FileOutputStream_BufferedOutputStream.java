package day4_set2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutputStream_BufferedOutputStream {

	public static void main(String[] args) {
		
		String data="This is a line of text inside the file";
		
		try {
			//creates a FileOutputStream
			FileOutputStream file=new FileOutputStream("output.txt");
			
			//creates a BufferedOutputStream
			BufferedOutputStream output=new BufferedOutputStream(file);
			
			byte[] array=data.getBytes();
			
			//writes data to the output stream
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}

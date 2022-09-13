package day4_set2;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		//create a file object
		File f = new File("file.txt");
		
		//deletes the file
		boolean value= f.delete();
		if(value) {
			System.out.println("The file is deleted");
		}
		else {
			System.out.println("The file is not deleted");
		}

	}

}

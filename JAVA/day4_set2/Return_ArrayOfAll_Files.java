package day4_set2;

import java.io.File;

public class Return_ArrayOfAll_Files {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\ustjavafsdb209\\eclipse-workspace\\java example 1");
		
		//returns an array of all files
		String[] fileList = f.list();
		
		for(String str:fileList) {
			System.out.println(str);
		}

	}

}

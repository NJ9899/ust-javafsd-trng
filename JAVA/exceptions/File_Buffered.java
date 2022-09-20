package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class File_Buffered {

	public static void main(String[] args) {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println("Enter the age: ");
			String age = br.readLine();
			System.out.println(age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

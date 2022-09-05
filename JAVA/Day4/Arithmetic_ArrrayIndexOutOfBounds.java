package day4;
//import java.io.*;

public class Arithmetic_ArrrayIndexOutOfBounds {

	public static void main(String[] args) {

		try {
			int array[]=new int[10];
			array[10]=30/0;
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

	}

}

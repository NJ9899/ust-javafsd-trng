package interfacesAndOthersDay3;

//Java program to illustrate the concept of Autoboxing and Unboxing

//importing required classes
import java.io.*;

//Main class
public class Autoboxing_Unboxing {

	//Main driver method
	public static void main(String[] args) {
		
		//Creating an Integer Object with custom value say it be 10
		Integer i = new Integer(10);
		
		//Unboxing the object
		int i1 = i;
		
		//Print statements
		System.out.println("Value of i: "+i);
		System.out.println("Value of i1: "+i1);

		//Autoboxing of character
		Character X='a';
		
		//Auto-unboxing of Character
		char ch=X;
		
		//Print statements
		System.out.println("Value of ch: "+ch);
		System.out.println("Value of X: "+X);
	}

}

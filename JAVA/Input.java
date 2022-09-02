package com.ust;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Getting float input
		System.out.print("Enter float: ");
		float myFloat = sc.nextFloat();
		System.out.println("Float entered= "+myFloat);
		
		//Getting double input
		System.out.print("Enter double: ");
		double myDouble = sc.nextDouble();
		System.out.println("Double entered= "+myDouble);
		
		//Getting String input
		//System.out.print("Enter text: ");
		String myString = sc.next();
		System.out.print("Text entered= "+myString);
		
		sc.close();
	}

}

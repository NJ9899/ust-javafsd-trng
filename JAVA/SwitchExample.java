package com.ust;

public class SwitchExample {
	public static void main(String args[]) {
		String str="Green";
		switch(str) {
		case "Red": System.out.println("I am in red");
					System.out.println("*");
					break;
		case "Green": System.out.println("I am in green");
					  System.out.println("*");
					  break;
		case "Yellow": System.out.println("I am in yellow");
					   System.out.println("*");
					   break;
		default: System.out.println("default");
					
		}
	}

}

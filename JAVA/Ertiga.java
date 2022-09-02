package com.ust;

class Car{
	String model;
	String colour;
	int wheels;
	int seats;
	String geartype;
	
	void display() {
		System.out.println("In Car class");
	}
}

class Ciaz extends Car{
	
	void display() {
		System.out.println("In Ciaz class");
	}
	
	void show() {
		System.out.println("In show method");
	}
}

public class Ertiga extends Car{

	void display() {
		System.out.println("In Ertiga class");
		super.display();
	}
	
	public static void main(String args[]) {
		Ciaz c = new Ciaz();
		c.display();
		c.show();
		
		Ertiga e = new Ertiga();
		e.display(); System.out.println(e.colour);
		
	}
}

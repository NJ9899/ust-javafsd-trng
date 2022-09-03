package com.ust;

public class Super_example extends Super_most{

	String color="white";
	
	Super_example(){
		super();
		System.out.println("in sub constructor");
		
	}
	
	void display() {
		System.out.println(color);
		System.out.println(super.color);
		super.display();
	}
	
	public static void main(String[] args) {
		Super_example s1 = new Super_example();
		//Super_most s2 = new Super_most();
		
		s1.display();

	}

}

class Super_most{
	String color="Black";
	
	Super_most(){
		System.out.println("in super constructor");
	}
	
	void display() {
		System.out.println("in super");
	}
}

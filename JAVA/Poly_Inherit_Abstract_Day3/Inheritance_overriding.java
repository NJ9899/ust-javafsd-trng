package Poly_Inherit_Abstract_Day3;

class Animal2{
	//overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog2 extends Animal2{
	
	//overriding method
	@Override
	public void display() {
		System.out.println("I am a dog");
	}
	
	public void printMessage() {
		
		//this calls overriding method
		display();
		
		//this calls overridden method
		super.display();
	}
}

public class Inheritance_overriding {

	public static void main(String[] args) {
		Dog2 d= new Dog2();
		d.printMessage();

	}

}

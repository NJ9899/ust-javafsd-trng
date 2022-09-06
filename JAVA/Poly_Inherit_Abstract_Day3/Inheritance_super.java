package Poly_Inherit_Abstract_Day3;

class Animal{
	public void displayInfo() {
		System.out.println("I am an animal");
	}
}

class Dog extends Animal{
	public void displayInfo() {
		super.displayInfo();
		System.out.println("I am a dog");
	}
}

public class Inheritance_super {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.displayInfo();
	}

}

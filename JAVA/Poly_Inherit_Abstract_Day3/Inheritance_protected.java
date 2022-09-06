package Poly_Inherit_Abstract_Day3;

class Animal1{
	protected void displayInfo() {
		System.out.println("I am an animal");
	}
}

class Dog1 extends Animal1{
	public void displayInfo() {
		System.out.println("I am a dog");
	}
}

public class Inheritance_protected {

	public static void main(String[] args) {
		Dog1 d= new Dog1();
		d.displayInfo();

	}

}

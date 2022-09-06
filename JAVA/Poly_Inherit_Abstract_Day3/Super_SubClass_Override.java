package Poly_Inherit_Abstract_Day3;

class Animal3{
	
	//method in the superclass
	public void eat() {
		System.out.println("I can eat");
	}
}

//Dog3 inherits Animal3
class Dog3 extends Animal3{
	
	//overriding the eat() method()
	@Override
	public void eat() {
		
		//call method of superclass
		super.eat();
		System.out.println("I eat dog food");
	}
	
	//new method in subclass
	public void bark() {
		System.out.println("I can bark");
	}
}

public class Super_SubClass_Override {

	public static void main(String[] args) {
		
		//create an object of the subclass
		Dog3 labrador = new Dog3();
		
		//call the eat method
		labrador.eat();
		labrador.bark();

	}

}

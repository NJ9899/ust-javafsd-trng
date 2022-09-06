package Poly_Inherit_Abstract_Day3;

class Animal4{
	
	protected String name;
	
	protected void display() {
		System.out.println("I am an animal");
		
	}
}

class Dog4 extends Animal4 {
	
	
	public void getInfo() {
		System.out.println("My name is "+name);
		
	}
}

public class ProtectedFieldMethods_SubclassObject {

	public static void main(String[] args) {
		// create an object of the subclass
		
		Dog4 labrador= new Dog4();
		
		//access protected field and method using the object of subclass
		labrador.name="Rocky";
		labrador.display();
		
		labrador.getInfo();

	}

}

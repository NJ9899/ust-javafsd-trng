package this_super_final_static;

class Animal1{
	
	//overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

class Dog1 extends Animal1{
	
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

public class Super_Animal_Dog_CallingSuper {

	public static void main(String[] args) {
		
		Dog1 dog1=new Dog1();
		dog1.printMessage();

	}

}

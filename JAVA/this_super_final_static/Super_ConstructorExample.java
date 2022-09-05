package this_super_final_static;

class Animal4{
	//default or no arg constructor of class Animal4
	Animal4(){
		System.out.println("I am an animal");
	}
}

class Dog4 extends Animal3{
	
	//default or no arg constructor of class Dog4
	Dog4(){
		
		//calling default constructor of the superclass
		super();
		System.out.println("I am a dog");
	}
	
}

public class Super_ConstructorExample {

	public static void main(String[] args) {
		Dog4 dog = new Dog4();

	}

}

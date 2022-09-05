package this_super_final_static;

class Animal5{
	
		//default or no arg constructor
		Animal5(){
			System.out.println("I am an animal");
		}
		
		//parameterized constructor
		Animal5(String type){
			System.out.println("Type: "+type);
		}
}

class Dog5 extends Animal5{
	
	//default constructor
	Dog5(){
		
		//calling parameterized constructor of the superclass
		super("Animal");
		System.out.println("I am a dog");
	}
}

public class Super_CallingParameterizedConstructor {

	public static void main(String[] args) {
		Dog5 dog = new Dog5();

	}

}

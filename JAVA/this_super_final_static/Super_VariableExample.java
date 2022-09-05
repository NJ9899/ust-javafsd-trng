package this_super_final_static;

class Animal3{
	
	protected String type="animal";
}

class Dog3 extends Animal3{
	
	public String type="mammal";
	
	public void printType() {
		
		System.out.println("I am a "+type);
		System.out.println("I am a "+super.type);
	}
}


public class Super_VariableExample {

	public static void main(String[] args) {
		Dog3 dog=new Dog3();
		dog.printType();

	}

}

package functional_interface;

@FunctionalInterface
interface sayable{
	void say(String msg);	//abstract method
	//it can contain any number of Object class methods.
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class Functional_Interface_Prgm1 implements sayable{

	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		Functional_Interface_Prgm1 f = new Functional_Interface_Prgm1();
		f.say("Hello there");
	}

}

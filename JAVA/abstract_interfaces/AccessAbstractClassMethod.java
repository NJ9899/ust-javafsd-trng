package abstract_interfaces;

abstract class Language{
	
	//method of abstract class
	public void display() {
		System.out.println("This is a Java Programming");
	}

}

public class AccessAbstractClassMethod extends Language{

	public static void main(String[] args) {
		
		// create an object of AccessAbstractClassMethod
		AccessAbstractClassMethod a = new AccessAbstractClassMethod();
		
		//access method of abstract class using object of AccessAbstractClassMethod class
		a.display();

	}

}

package abstract_interfaces;

abstract class A3{
	
	int x=10;
	
	A3(){
		
		System.out.println("Constructor in abstract class");
	}
	
	abstract void getX();
}


public class Abstract_Constructor_super extends A3{

	Abstract_Constructor_super(){
		super();
	}
	
	void getX() {
		
		System.out.println("x = "+x);
		
	}
	
	public static void main(String[] args) {
		
		Abstract_Constructor_super a = new Abstract_Constructor_super();
		a.getX();

	}

}

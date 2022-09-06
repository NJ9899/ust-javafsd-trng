package abstract_interfaces;

abstract class Abstract1{
	
	int age;
	String name,address;
	
	void display() {
		System.out.println(age+" "+address+" "+name);
	}
	
	int show() {
		return 0;
	}
	
	abstract float calculate();
	abstract void check();
}

public class Abstract_Eg extends Abstract1{

	float calculate() {
		return 0f;
	}
	
	void check() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}





package interfacesAndOthersDay3;

//Java code for using this keyword to return the current class instance

public class this_return_current_object {

	int a,b;
	
	//Default constructor
	this_return_current_object(){
		
		a=10;
		b=20;
	}
	
	//Method that returns current class instance
	this_return_current_object get() {
		return this;
	}
	
	//Displaying value of variables a and b
	void display() {
		System.out.println("a = "+a+" b = "+b);
	}
	
	public static void main(String[] args) {
		this_return_current_object t = new this_return_current_object();
		t.get().display();

	}

}

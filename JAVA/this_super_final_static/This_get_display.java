package this_super_final_static;

class Test_this1{
	int val_a;
	int val_b;
	
	//Default Constructor
	Test_this1(){
		val_a=10;
		val_b=20;
	}
	
	Test_this1 get() {
		return this;
	}
	
	void display() {
		System.out.println("val_a = "+val_a+" val_b = "+val_b);
	}
}

public class This_get_display {

	public static void main(String[] args) {
		Test_this1 object = new Test_this1();
		object.get().display();
	}

}

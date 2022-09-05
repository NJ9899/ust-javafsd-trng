package this_super_final_static;

class Test_this{
	
	void print() {
		//calling function show()
		this.show();
		System.out.println("Test_this::print");
	}
	
	void show() {
		System.out.println("Test_this::show");
	}
}

public class This_CallingMethod {
	
	public static void main(String[] args) {
		Test_this t1 = new Test_this();
		t1.print();

	}

}

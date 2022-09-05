package this_super_final_static;

class This_Test1 {

	int val1;
	int val2;
	
	This_Test1(){
		val1=10;
		val2=20;
	}
	
	void printVal(This_Test1 obj) {
		System.out.println("val1 = "+obj.val1+" val2 = "+obj.val2);
	}
	
	void get() {
		printVal(this);
	}
}

public class This_ObjectAsArgument {
	
	public static void main(String[] args) {
		This_Test1 object = new This_Test1();
		object.get();

	}

}

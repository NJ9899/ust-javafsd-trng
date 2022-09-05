package this_super_final_static;

class FinalDemo{
	//create a final method
	public final void display() {
		System.out.println("This is a final method");
	}
}

public class Final_Method extends FinalDemo {

	
	//try to override final method
	public final void display() {
		System.out.println("The final method is overridden");
	}
	
	public static void main(String[] args) {

		FinalDemo obj=new FinalDemo();
		obj.display();

	}

}

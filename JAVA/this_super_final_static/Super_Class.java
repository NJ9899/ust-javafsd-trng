package this_super_final_static;

final class FinalClass{
	public void display() {
		System.out.println("This is the final method");
	}
}


//try to extend the final class
public class Super_Class extends FinalClass {

	public void display() {
		System.out.println("The final method is overridden");
	}
	public static void main(String[] args) {
		FinalClass f=new FinalClass();
		obj.display();

	}

}

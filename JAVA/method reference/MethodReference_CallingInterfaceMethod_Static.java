package method_reference;

interface Sayable{
	void say();
}

public class MethodReference_CallingInterfaceMethod_Static {

	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}
	
	public static void main(String args[]) {
		
		//referring static method
		Sayable sayable  = MethodReference_CallingInterfaceMethod_Static::saySomething;
		
		//calling interface method
		sayable.say();
	}
}

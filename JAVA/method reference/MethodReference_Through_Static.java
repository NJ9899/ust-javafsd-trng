package method_reference;

public class MethodReference_Through_Static {

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(MethodReference_Through_Static::ThreadStatus);
		t1.start();
		
	}

}

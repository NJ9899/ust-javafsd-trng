package package_thread;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
		Runnable r = new Thread2();
		r.run();

	}
	
	public void run() {
		System.out.println("In thread");
	}

}

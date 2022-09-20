package package_thread;

public class Thread3 extends Thread{
	public static void main(String[] args) {
		
		Thread3 t3 = new Thread3();
		try {
			System.out.println("Hi");
			t3.sleep(5000);
			System.out.println("sleep");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

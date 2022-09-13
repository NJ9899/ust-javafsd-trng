package day5_set1;

public class Thread_Extends extends Thread{
	
	public Thread_Extends(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread_Extends - START "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			//get database connection, delete unused data from DB
			doDBProcessing();
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread_Extends - END "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void main(String[] args) {
		Thread_Extends t = new Thread_Extends("Namitha");
		t.start();

	}

}

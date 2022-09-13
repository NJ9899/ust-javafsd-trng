package day5_set1;

public class Thread_Runnable_setPriority implements Runnable{

	
	@Override
	public void run() {
		
	}
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		
		try {
			t1.sleep(1000);
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.setPriority(1);
		int priority= t1.getPriority();
		System.out.println(priority);
		System.out.println("Thread Running");
		t1.start();

	}

}

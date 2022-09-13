package day5_set1;

public class Thread1_Runnable implements Runnable{

	public static void main(String[] args) {
		Thread t1 = new Thread("Guru1");
		Thread t2 = new Thread("Guru2");
		
		t1.start();
		t2.start();
		
		System.out.println("Thread names are following: ");
		System.out.println(t1.getName());
		System.out.println(t2.getName());

	}
	
	@Override
	public void run() {
		//Runnable r = new Thread1_Runnable();
		//r.run();
	}

}

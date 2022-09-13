package day5_set1;

import java.lang.*;

//java program to illustrate join() method in java

public class Thread_Runnable_join implements Runnable{

	
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+t.getName());
		
		//checks if current thread is alive
		System.out.println("Is Alive?"+t.isAlive());
	}
	public static void main(String[] args) throws Exception{
		
		Thread t = new Thread(new Thread_Runnable_join());
		t.start();
		
		//waits for 1000ms this thread to die
		t.join(1000);
		
		System.out.println("\nJoining after 1000"+" milliseconds: \n");
		System.out.println("Current thread: "+t.getName());
		
		//checks if this thread is alive
		System.out.println("Is alive?"+t.isAlive());

	}

}

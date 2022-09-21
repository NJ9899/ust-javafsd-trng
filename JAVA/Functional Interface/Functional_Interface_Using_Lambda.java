package functional_interface;

//java program to demonstrate implementation of functional interface using lambda expressions

public class Functional_Interface_Using_Lambda {

	public static void main(String[] args) {
		
		//lambda expression to create the object
		new Thread(()->{
			System.out.println("New thread created");
		}).start();

	}

}

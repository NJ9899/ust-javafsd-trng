package Poly_Inherit_Abstract_Day3;

public class MethodOverloading {

	//this method accepts int
	private static void  display(int a) {
		System.out.println("Got Integer data");
	}
	
	//this method accepts String object
		private static void  display(String a) {
			System.out.println("Got String data");
		}
	
	public static void main(String[] args) {
		
		display(1);
		display("Hello");

	}

}

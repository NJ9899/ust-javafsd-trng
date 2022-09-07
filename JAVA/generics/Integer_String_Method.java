package generics;

class DemoClass{
	
	//create a generics method
	public <T> void genericsMethod(T data) {
		System.out.println("Generics method: ");
		System.out.println("Data passed: "+data);
	}
}

public class Integer_String_Method {

	public static void main(String[] args) {
		
		//initialize the class with Integer data 
		DemoClass demo = new DemoClass();
		
		//generics method working with String
		demo.<String>genericsMethod("Java Programming");
		
		System.out.print("\n");
		
		//generics method working with Integer
		demo.<Integer>genericsMethod(25);

		
	}

}

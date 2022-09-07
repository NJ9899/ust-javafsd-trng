package generics;

class GenericsClass <T extends Number>{
	
	public void display() {
		System.out.println("This is a bounded type generics class");
	}
}

public class ExtendsNumber_StringError {

	public static void main(String[] args) {
		
		//create an object of GenericsClass
		//GenericsClass<String> obj =new GenericsClass<>();
		GenericsClass<Integer> obj1 =new GenericsClass<>();
		
		//obj.display();
		obj1.display();

	}

}

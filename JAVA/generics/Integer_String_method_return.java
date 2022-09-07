package generics;

//create a generic class
class GenericClass<T>{
	
	//variable of T type
	private T data;
	
	public GenericClass(T data) {
		this.data=data;
	}
	
	//method that return T type variable
	public T getData() {
		return this.data;
	}
}

public class Integer_String_method_return {

	public static void main(String[] args) {
		
		//initialize generic class with Integer data
		GenericClass <Integer> intObj = new GenericClass <>(5);
		System.out.println("Generic Class returns: "+intObj.getData());
		
		//initialize generic class with String data
		GenericClass <String> stringObj = new GenericClass <>("Java Programming");
		System.out.println("Generic Class returns: "+stringObj.getData());

	}

}

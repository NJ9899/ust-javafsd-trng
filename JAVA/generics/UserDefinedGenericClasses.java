package generics;

//java program to show working of user-defined generic classes

//we use <> to specify parameter type

class Test1<T>{
	
	//an object of type T is declared
	T obj;
	
	Test1(T obj){
		this.obj=obj;	//constructor
	}
	
	public T getObject() {
		return this.obj;
	}
}


//driver class to test above
public class UserDefinedGenericClasses {

	public static void main(String[] args) {
		
		//instance of integer type
		Test1 <Integer> iObj = new Test1<Integer>(15);
		System.out.println(iObj.getObject());
		
		//instance of String type
		Test1 <String> sObj = new Test1<String>("Namitha");
		System.out.println(sObj.getObject());
		//	iObj = sObj;	//This results an error
		

	}

}

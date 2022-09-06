package interfacesAndOthersDay3;

//Java code for using this() to invoke current class constructor

public class this_invoke_current_class_constructor {

	int a,b;
	
	//Default constructor
	this_invoke_current_class_constructor(){
				
		this(10,20);
		System.out.println("Inside default constructor\n");
	}
	
	//Parameterized constructor
		this_invoke_current_class_constructor(int a,int b){
					
			this.a=a;
			this.b=b;
			System.out.println("Inside parameterized constructor\n");
		}
	
	public static void main(String[] args) {
		
		this_invoke_current_class_constructor t = new this_invoke_current_class_constructor();

	}

}

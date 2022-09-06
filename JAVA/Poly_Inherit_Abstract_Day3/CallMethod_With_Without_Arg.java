package Poly_Inherit_Abstract_Day3;

class Pattern{
	
	//method without parameter
	public void display() {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
	}
	
	//method with single parameter
	public void display(char symbol) {
		for(int i=0;i<10;i++) {
			System.out.print(symbol);
		}
	}

}

public class CallMethod_With_Without_Arg {

	public static void main(String[] args) {
		
		Pattern p = new Pattern();
		
		//call method without any argument
		p.display();
		System.out.println("\n");
		
		//call method with a single argument
		p.display('#');
	

	}

}

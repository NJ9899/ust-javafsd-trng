package abstract_interfaces;

interface A2{
	
	void show();
}

interface B2{
	
	void display();
}


public class Q2_Implement_Interface implements A2,B2{

	public void show() {
		System.out.println("Hello");
		
	}
	
	public void display() {
		System.out.println("Namitha");
	}
	
	public static void main(String[] args) {
		
		Q2_Implement_Interface q = new Q2_Implement_Interface();
		q.show();
		q.display();
		

	}

}

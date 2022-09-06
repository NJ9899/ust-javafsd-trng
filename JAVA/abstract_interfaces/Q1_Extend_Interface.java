package abstract_interfaces;

interface A1{
	
	void show();
}

interface B1{
	void display();
}

interface C1 extends A1,B1{
	
	void show();
	void display();
}



public class Q1_Extend_Interface implements C1{

	public void show() {
		System.out.println("Hello");
		
	}
	
	public void display() {
		System.out.println("Namitha");
	}
	
	public static void main(String[] args) {
		
		Q1_Extend_Interface q = new Q1_Extend_Interface();
		q.show();
		q.display();

	}

}

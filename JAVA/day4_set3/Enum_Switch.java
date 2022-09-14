package day4_set3;

enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test{
	
	Size1 pizzaSize;
	public Test(Size1 pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	
	public void orderPizza() {
		
		switch(pizzaSize) {
		
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
			
		case MEDIUM:
			System.out.println("I ordered a medium size pizza");
			break;
			
		default:
			System.out.println("I don't know which one to order");
			break;
		}
	}
		
	
}

public class Enum_Switch {

	public static void main(String[] args) {
		
		Test t = new Test(Size1.MEDIUM);
		t.orderPizza();

	}

}

package day4;

public class Arithmetic_division_by_zero {

	public static void main(String[] args) {
		
		try {
			
			//code that generate exception 
			int dividebyZero=5/0;
			System.out.println("Rest of code in try block");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException => "+e.getMessage());
		}

	}

}

package day4;

public class Arithmetic_division_by_zero_finally {

	public static void main(String[] args) {
		
		try {
			
			//code that generate exception 
			int dividebyZero=5/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException => "+e.getMessage());
		}
		
		finally {
			System.out.println("This is the finally block");
		}

	}

}

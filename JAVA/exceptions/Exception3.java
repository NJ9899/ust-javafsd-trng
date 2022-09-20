package exceptions;

public class Exception3 {
	
	public double calculator(int a, int b) throws Exception
	{
		//throw new Exception("abc");
		return (a+b);
	}
	
	void display(int x) throws Exception{
		if(x==5) throw new Exception();
		else
			System.out.println();
	}

	public static void main(String[] args) {
		
		Exception3 e = new Exception3();
		try {
			e.calculator(5, 6);
			e.display(5);
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		

	}

}

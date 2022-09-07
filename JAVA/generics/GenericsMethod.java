package generics;

class GenericsType<T>{
	
	T g;
	
	public void set(T g1) {
		this.g=g1;
	}
	
	public T get() {
		return this.g;
	}
}

public class GenericsMethod {

	//java generic method
	public static <T> boolean isEqual(GenericsType <T> g1, GenericsType <T> g2) {
		return g1.get().equals(g2.get());
	}
	
	public static void main(String[] args) {
		
		GenericsType<String> g1=new GenericsType<>();
		g1.set("Pankaj");
		
		GenericsType<String> g2=new GenericsType<>();
		g2.set("Pankaj");
		
		boolean isEqual=GenericsMethod.<String>isEqual(g1,g2);
		
		//above statement can be written simply as 
		isEqual = GenericsMethod.isEqual(g1, g2);
		System.out.println(isEqual);
	}

}

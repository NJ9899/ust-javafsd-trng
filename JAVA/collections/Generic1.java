package collections;

public class Generic1 <T>{
	
	T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		
		Generic1<String> g = new Generic1<>();
		g.set("Hi");
		System.out.println(g.get());
		
		Generic1<Integer> g1 = new Generic1<>();
		g1.set(100);
		System.out.println(g1.get());

	}

}

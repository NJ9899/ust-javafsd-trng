package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics_ArrayList_sum {

	public static double sum(List<? extends Number> list) {
		
		double sum = 0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(3);
		l.add(5);
		l.add(10);
		
		double sum= sum(l);
		System.out.println("Sum of l: "+sum);
	}

}

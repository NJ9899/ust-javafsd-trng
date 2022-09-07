package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections2 {

	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList <Integer>();	//restricting to Integer type
		l.add(456);
		l.add(123);
		l.add(789);
		l.add(34);
		//l.add(3.4);//float not allowed since its restricted to Integer
		System.out.println(l);

	}

}

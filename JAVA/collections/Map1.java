package collections;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1, "glory");
		m.put(null, null);
		//m.put(1, "Haridev");//overrides glory
		m.put(2, "Haridev");
		
		System.out.println(m.get(1));
		

	}

}

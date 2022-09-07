package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<>();
		
		m.put(1, "Namitha");
		m.put(2, "Sandra");
		m.put(3, "Absee");
		
		Set keys = m.keySet();
		System.out.println(keys);

	}

}

package enumerations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationArrayList {

	public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(2);
		list.add(73);
		
		Enumeration en = Collections.enumeration(list);	//getting enumeration over ArrayList
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}
}

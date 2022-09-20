package enumerations;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class Enumeration_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		
		Enumeration en = Collections.enumeration(hs);	
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
			
		}
	}

}

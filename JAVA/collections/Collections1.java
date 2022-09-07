package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		
		List l=new ArrayList();	//list object creation
		l.add("abc");
		l.add(123);
		l.add(true);
		l.add(3.4);
		
		Iterator itr = l.iterator();	//another way of iterating
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			if(itr.next() instanceof String) {
				System.out.println(itr.next().toString().toUpperCase());
			}
			
		}
		
		
		for(Object o:l) {	//another way to print list values
			System.out.println(o+"\n");
		}
		
		System.out.println(l);

	}

}

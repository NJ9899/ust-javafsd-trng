package day5_Set2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator_remove_hasNext {

	public static void main(String[] args) {
		
		//creating an ArrayList
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("ArrayList: "+numbers);
		
		//Creating an instance of Iterator
		Iterator<Integer> iterate=numbers.iterator();
		
		//Using the next() method
		int number=iterate.next();
		System.out.println("Accessed Element: "+number);
		
		//using the remove() method
		iterate.remove();
		System.out.println("Removed Element: "+number);
		
		System.out.println("Updated ArrayListt: ");
		
		//using the hashNext() method
		while(iterate.hasNext()) {
			//using the forEachRemaining() method
			iterate.forEachRemaining((value) -> System.out.print(value+","));
		}
		
		

	}

}

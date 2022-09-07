package day5_Set2;

import java.util.TreeMap;

public class Map_TreeMap_put_putifabsent_putall {

	public static void main(String[] args) {
		
		//creating TreeMap of even numbers
		TreeMap <String,Integer> evenNumbers = new TreeMap<>();
		
		//using put()
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		
		//using putIfAbsent()
		evenNumbers.putIfAbsent("Six",6);
		System.out.println("TreeMap of even numbers: "+evenNumbers);
		
		//creating TreeMap of numbers
		TreeMap <String,Integer> numbers = new TreeMap<>();
		numbers.put("One",1);
		
		//using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers: "+numbers);
		

	}

}

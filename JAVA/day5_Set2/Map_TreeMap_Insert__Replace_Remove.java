package day5_Set2;

import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap_Insert__Replace_Remove {

	public static void main(String[] args) {
		
		//creating a map using the TreeMap
		Map <String,Integer> values = new TreeMap<>();
		
		//Insert elements to the map
		values.put("Second",2);
		values.put("First",1);
		System.out.println("Map using TreeMap: "+values);
		
		//Replacing the values
		values.replace("First", 11);
		values.replace("Second", 22);
		System.out.println("New Map: "+values);
		
		//Remove element from the map
		int removedValue=values.remove("First");
		System.out.println("Removed Value: "+removedValue);

	}

}

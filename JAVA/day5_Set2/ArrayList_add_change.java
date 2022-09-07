package day5_Set2;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_add_change {

	public static void main(String[] args) {
		
		ArrayList <String> languages = new ArrayList<>();
		
		//Add elements to the list
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println("ArrayList: "+languages);
		
		//change the element of the array list
		languages.set(2, "JavaScript");
		System.out.println("Modified ArrayList: "+languages);

	}

}

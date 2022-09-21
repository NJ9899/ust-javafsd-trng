package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEg2_MethodReference {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>();
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hocky");
		System.out.println("----------Iterating by passing passing method reference----------");
		gameList.forEach(System.out::println);
	}

}

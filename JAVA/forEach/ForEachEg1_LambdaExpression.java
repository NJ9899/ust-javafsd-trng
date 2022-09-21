package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEg1_LambdaExpression {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>();
		gameList.add("Footbal");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hocky");
		System.out.println("----------Iterating by passing lambda expression----------");
		gameList.forEach(games->System.out.println(games));
	}

}

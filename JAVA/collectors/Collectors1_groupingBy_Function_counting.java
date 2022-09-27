package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectors1_groupingBy_Function_counting {

	public static void main(String[] args) {
		
		List <String> names = Arrays.asList("Jon","Ajeet","Steeve","Ajeet","Jon","Ajeet");
		
		Map <String,Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);

	}

}

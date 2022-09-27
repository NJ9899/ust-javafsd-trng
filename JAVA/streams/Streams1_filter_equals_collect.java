package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1_filter_equals_collect {

	public static void main(String[] args) {
		List <String> lines = Arrays.asList("Walnut","Apricot","Almond");
		List <String> result = lines.stream().filter(line -> !"almond".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);

	}

}

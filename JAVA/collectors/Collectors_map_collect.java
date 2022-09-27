package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class Collectors_map_collect {

	public static void main(String[] args) {
		
		List <Student> studentList = new ArrayList<Student>();
		
		//adding students
		studentList.add(new Student(11,"Jon",22));
		studentList.add(new Student(22,"Steve",18));
		studentList.add(new Student(33,"Lucy",22));
		studentList.add(new Student(44,"Sansa",23));
		studentList.add(new Student(55,"Maggie",18));
		
		//fetching student names as List
		List<String> names = studentList.stream().map(n -> n.name).collect(Collectors.toList());
		System.out.println(names);

	}

}

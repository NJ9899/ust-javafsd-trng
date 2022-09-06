package interfacesAndOthersDay3;

//create an interface
interface Language{
	void getName(String name);
}

class ProgrammingLanguage implements Language{
	
	//implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language: "+name);
	}
}

public class Interface_implementation_Language {

	public static void main(String[] args) {
		
		ProgrammingLanguage l = new ProgrammingLanguage();
		l.getName("Java");

	}

}

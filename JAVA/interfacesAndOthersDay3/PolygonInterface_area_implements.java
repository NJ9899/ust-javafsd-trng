package interfacesAndOthersDay3;

interface Polygon{
	void getArea();
	
	//default method
	default void getSides() {
		System.out.println("I can get sides of a polygon");
	}
}

//implenmenting the interface
class Rectangle implements Polygon{
	public void getArea() {
		int length=6;
		int breadth=5;
		int area = length*breadth;
		System.out.println("The area of the rectangle is "+area);
	}
	
	//override the getSides()
	public void getSides() {
		System.out.println("I have 4 sides");
	}
}

//implements the interface
class Square implements Polygon{
	public void getArea() {
		int length=5;
		int area = length*length;
		System.out.println("The area of the square is "+area);
	}
}

public class PolygonInterface_area_implements {

	public static void main(String[] args) {
		
		//create an object of Rectangle
		Rectangle r = new Rectangle();
		r.getArea();
		r.getSides();
		
		//create an object of Square
		Square s = new Square();
		s.getArea();
		s.getSides();

	}

}

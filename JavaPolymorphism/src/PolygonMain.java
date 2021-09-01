
public class PolygonMain {
	public static void main(String[] args) {
		Polygon polygon; //ref
		
//		polygon=new Polygon();
//		polygon.calcArea(12.3, 4.5);
//		polygon.displayArea();
		
		polygon=new Rectangle(); //upcasting
		polygon.calcArea(12.3, 4.5);
		polygon.displayArea();
		
		Rectangle rectangle=(Rectangle) polygon; //downcasting
		rectangle.printInfo();
		
		polygon=new Triangle(); //upcasting
		polygon.calcArea(12.3, 4.5);
		polygon.displayArea();
		
	}
}

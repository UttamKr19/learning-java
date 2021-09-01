
public class Rectangle extends Polygon {
	@Override
	public void calcArea(double l, double b) {
		System.out.println("-- calcArea of Rectangle");
		area = l * b;
	}
	
	public void printInfo() {
		System.out.println("printInfo() in rectangle");
	}
}

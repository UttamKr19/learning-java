
public abstract class Polygon {
	double area;

	public Polygon() {
		System.out.println("Polygon class const");
	}
	
	public abstract void  calcArea(double l, double b);

	public void displayArea() {
		System.out.println("Area is: " + area);
	}
}

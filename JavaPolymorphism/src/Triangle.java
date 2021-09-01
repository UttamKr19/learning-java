
public class Triangle extends Polygon {
	@Override
	public void calcArea(double l, double b) {
		System.out.println("-- calcArea of Triangle");
		area = 0.5 * l * b;
	}
}

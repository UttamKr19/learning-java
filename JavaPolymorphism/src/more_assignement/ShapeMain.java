package more_assignement;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape=new Line();
		shape.draw();
		shape=new Rectangle();
		shape.draw();
		shape=new Cube();
		shape.draw();
	}
}

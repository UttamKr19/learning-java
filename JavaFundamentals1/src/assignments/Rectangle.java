package assignments;

public class Rectangle {
	private double length;
	private double breadth;
	
	public Rectangle() {
		length = 0;
		breadth = 0;
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	public double area(){
		return length*breadth;
	}
	
	public void displayInfo() {
		System.out.println("\nDisplaying rectangle info-----------");
		System.out.println("len: "+length);
		System.out.println("breadth: "+breadth);
		System.out.println("area: "+area());
	}
	
	
	
}

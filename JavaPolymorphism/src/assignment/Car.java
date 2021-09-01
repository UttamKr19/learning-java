package assignment;

public abstract class Car {
	private double speed;
	private int noOfGear;
	
	public Car() {
		speed=150;
		noOfGear=4;
	}
	public abstract void drive();
	
	public void display() {
		System.out.println("Display car properties");
		System.out.println("Speed: "+speed +"\n"+"Gears: "+noOfGear);
	}
}

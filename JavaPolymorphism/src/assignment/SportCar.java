package assignment;

public class SportCar extends Car{

	public String AirBallonType;
	
	public SportCar(){
		AirBallonType="Type 2";
	}
	
	@Override
	public void drive() {
		System.out.println("fast");
	}
	
	public void display() {
		super.display();
		System.out.println("AirBallonType: "+AirBallonType);
	}

}

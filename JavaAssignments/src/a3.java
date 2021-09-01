
public class a3 {
	static void speedCalculator(double distance,double time) {
		System.out.println(distance/time +" m/s");
		System.out.println((distance/1000)/(time/3600)+" km/hr");
		System.out.println((distance/1609)/(time/3600)+" miles/hr");
	}
	
	public static void main(String[] args) {
		speedCalculator(120, 5);
	}
}

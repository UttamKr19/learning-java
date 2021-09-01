package more_assignement;

public class Labour extends Employee {
	private double overtime;
	private double base;

	public Labour(double overtime, double base) {
		this.overtime = overtime;
		this.base = base;
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Total salary: "+(base+overtime));
	}

}

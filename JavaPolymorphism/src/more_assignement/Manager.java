package more_assignement;

public class Manager extends Employee{
	private double incentive;
	private double base;
	
	public Manager(double base,double incentive) {
		this.base=base;
		this.incentive=incentive;
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Total salary: "+(base+incentive));
	}
	
	
	
}

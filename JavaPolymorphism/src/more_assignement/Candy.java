package more_assignement;

public class Candy extends DessertItem {

	private double tax;
	private double cost;
	
	public Candy(double price) {
		this.tax = 5;
		this.cost=price+(price*tax/100);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}

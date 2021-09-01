package more_assignement;

public class SavingAccount extends Bank{
	private double fixedDeposits;

	public SavingAccount(String name,double fixedDeposits) {
		super(name);
		this.fixedDeposits = fixedDeposits;
	}

	public double getFixedDeposits() {
		return fixedDeposits;
	}

	public void setFixedDeposits(double fixedDeposits) {
		this.fixedDeposits = fixedDeposits;
	}
	
	
	
}

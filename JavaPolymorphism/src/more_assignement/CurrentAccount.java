package more_assignement;

public class CurrentAccount extends Bank{
	private double cashCredit;
	
	public CurrentAccount(String name,double cashCredit) {
		super(name);
		this.cashCredit = cashCredit;
	}

	public double getCashCredit() {
		return cashCredit;
	}

	public void setCashCredit(double cashCredit) {
		this.cashCredit = cashCredit;
	}

}

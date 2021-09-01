
public enum Payment {
	DEBITCARD(5),CREDITCARD(8),COD(0);
	
	private int charges;
	
	private Payment(int charges) {
		this.charges=charges;
	}
	
	public int getCharges() {
		return charges;
	}
}

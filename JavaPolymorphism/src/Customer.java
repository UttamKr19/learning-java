
public class Customer {
	private double totalBill;
	private Payment modeOfPayment;
	private Seasons season;

	public Customer(double totalBill, Payment modeOfPayment,Seasons season) {
		this.totalBill = totalBill;
		this.modeOfPayment = modeOfPayment;
		this.season=season;
	}
	
	public double calculateBillAfterCharges() {
		double charges=modeOfPayment.getCharges();
		return totalBill+totalBill*charges/100;
	}
	
	public double calculateBillAfterDiscount() {
		double bill=calculateBillAfterCharges();
		double discount=bill*season.getdiscount()/100;
		double finalBill=bill-discount;
		return finalBill;
	}
}

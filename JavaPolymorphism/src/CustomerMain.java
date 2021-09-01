
public class CustomerMain {
	public static void main(String[] args) {
		double bill=5000;
		String mop="debitcard";
		Payment modeOfPayment=Payment.valueOf(mop.toUpperCase());
		Seasons season=Seasons.SPRING;
		Customer cust=new Customer(bill,modeOfPayment,season);
		System.out.println(cust.calculateBillAfterDiscount());
	}
}

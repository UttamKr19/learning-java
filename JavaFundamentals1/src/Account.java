
public class Account {
	private static int accNumber;
	private String accHolder;
	private String accType;
	private double balance;
	
	public Account(String accHolder, String accType, double balance) {
		accNumber++;
		this.accHolder = accHolder;
		this.accType = accType;
		this.balance = balance;
	}

	public double depositAmount(double amount) {
		balance+=amount;
		return balance;
	}
	
	public static void displayBankDetails() {
		System.out.println("ABC bank");
	}
	
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + "[accHolder=" + accHolder + ", accType=" + accType + ", balance=" + balance + "]";
	}
}

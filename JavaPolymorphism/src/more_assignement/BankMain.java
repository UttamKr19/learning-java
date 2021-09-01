package more_assignement;

public class BankMain {
	public static void main(String[] args) {
		Bank b;
		b=new SavingAccount("Uttam",2000);
		SavingAccount s=(SavingAccount)b;
		b=new CurrentAccount("Kumar", 3000);
		CurrentAccount c=(CurrentAccount)b;
		
		
		System.out.println("Total cash: "+(s.getFixedDeposits()+c.getCashCredit()));
	}
}

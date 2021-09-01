
public class MyBank {
	public static void main(String[] args) {
		
		Account.displayBankDetails();
		
		Account account1=new Account("Uttam","Savings",100);
		System.out.println(account1);
		Account account2=new Account("Kumar","Savings",200);		
		System.out.println(account2);
		Account account3=new Account("ZZZ","Savings",300);		
		System.out.println(account3);
	}
}

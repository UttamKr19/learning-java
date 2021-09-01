package more_assignement;

public class Bank {
	private static int accNo;
	private int accountNo;
	private String name;
	
	public Bank(String name) {
		this.accountNo = accNo++;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", name=" + name + "]";
	}
	
	

}

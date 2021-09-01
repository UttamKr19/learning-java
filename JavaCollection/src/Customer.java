import java.util.Date;

public class Customer {
	private static int incrementID;
	private int customerId;
	private String customerName;
	private String address;

	public Customer(String customerName, String address) {
		this.customerId = incrementID++;
		this.customerName = customerName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer customer1, Customer customer2) {
		Integer custId1=customer1.getCustomerId();
		Integer custId2=customer2.getCustomerId();
		
		return custId1.compareTo(custId2);
	}

}

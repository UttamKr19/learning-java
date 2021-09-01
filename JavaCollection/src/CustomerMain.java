import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerMain {
	public static void main(String[] args) {
		Set<Customer> customers = new TreeSet<>(new CustomerIdComparator());

		Customer c1 = new Customer("Thanos", "Titan");
		Customer c2 = new Customer("Peter", "Earth");
		Customer c3 = new Customer("Thor", "Asgard");
		Customer c4 = new Customer("Loki", "Asgard");
		Customer c5 = new Customer("Gamora", "Titan");

		System.out.println("\n----------sort based on id----------------------\n");

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}

		System.out.println("\n----------sort based on name----------------------\n");

		customers = new TreeSet<>(new Comparator<Customer>() {
			@Override
			public int compare(Customer customer1, Customer customer2) {
				return customer1.getCustomerName().compareTo(customer2.getCustomerName());
			}
		});

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}

		System.out.println("\n-----------sort based on address + name---------------------\n");

		customers = new TreeSet<>(new Comparator<Customer>() {
			@Override
			public int compare(Customer customer1, Customer customer2) {
				if(customer1.getAddress().compareTo(customer2.getAddress())==0) {
					return customer1.getCustomerName().compareTo(customer2.getCustomerName());
				}
				return customer1.getAddress().compareTo(customer2.getAddress());
			}
		});

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
	}
}

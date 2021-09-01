package assignments;

public class Hotel {
	
	public static void displayBill(Guest_Bill[] bills) {
		System.out.println("Hotel Paradise\n------------------");
		for (Guest_Bill bill : bills) {
			System.out.println("Name: "+bill.getGuestName());
			System.out.println("Room Rent: "+bill.getRoomrent());
			System.out.println("Food: "+bill.getFood());
			System.out.println("Discount: "+bill.getDiscount());
			System.out.println("Net Payble amount: "+(bill.getFood()+bill.getRoomrent()-bill.getDiscount()));
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Guest_Bill[] guests=new Guest_Bill[3];
		
		guests[0]=new Guest_Bill("uttam", "Jul", 2000, 3000);
		guests[1]=new Guest_Bill("kumar", "Oct", 2000, 3000);
		guests[2]=new Guest_Bill("uttam kumar", "Dec", 1000, 3400.50);		

		
		displayBill(guests);
		
	}
}

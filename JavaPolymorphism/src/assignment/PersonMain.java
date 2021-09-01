package assignment;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Person[] person = new Person[3];
		int noOfPerson = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose option from Menu : ");
			System.out.println("1.	Add Person\r\n"
					+ "2.	Search Person\r\n"
					+ "3.	Display All\r\n"
					+ "4.	Exit\n");
			
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if(noOfPerson>2) {
					System.out.println("Cannot add more person");
					break;
				}
				System.out.println("Selected option: Adding Person");
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter telephone: ");
				long tele = sc.nextLong();
				System.out.println("Enter dob (date): ");
				int d = sc.nextInt();
				System.out.println("Enter dob (month): ");
				String m = sc.next();
				System.out.println("Enter dob (year): ");
				int y = sc.nextInt();

				DOB dob = new DOB(d, m, y);
				person[noOfPerson] = new Person(name, tele, dob);
				noOfPerson++;

				break;
			case 2:
				System.out.println("Selection option: Searching");
				System.out.println("Enter month (Dob): ");
				String month = sc.next();
				System.out.println("---------Birthday Details---------");
				
				int flag=0;
				
				if(noOfPerson==0) {
					System.out.println("No records to display");
				}
				for(int j=0;j<noOfPerson;j++) {
					if(person[j].getMonth().equals(month)) {
						System.out.println("Name: "+person[j].getPerson_Name());
						System.out.println("Telephone: "+person[j].getPerson_Telephone());
						System.out.println("DOB: "+person[j].getDay()+" "+person[j].getMonth()+" "+person[j].getYear());
						System.out.println("-----------------------------------");
						flag=1;
					}
					
				}
				
				if(flag==0) {
					System.out.println("No record found");
				}

				break;

			case 3:
				System.out.println("Selected option: Display all records");
				if(noOfPerson==0) {
					System.out.println("No records to display");
				}
				for(int j=0;j<noOfPerson;j++) {
					System.out.println("Person ID: "+person[j].getPerson_ID());
					System.out.println("Name: "+person[j].getPerson_Name());
					System.out.println("Telephone: "+person[j].getPerson_Telephone());
					System.out.println("DOB: "+person[j].getDay()+" "+person[j].getMonth()+" "+person[j].getYear());
					System.out.println("-----------------------------------");
				}
				
				break;

			case 4:
				System.out.println("Selected option: Exit");
				System.out.println("Exiting program");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		}
	}
}

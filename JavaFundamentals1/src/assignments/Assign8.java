package assignments;

public class Assign8 {
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int arr[]= {1,34,23,6,23,30};
		
		if(first>=1 && first<=40 && second>=1 && second<=40) {
			System.out.println("First Number: "+first + " \nSecond Number: " + second);

			boolean firstFound=false;
			boolean secondFound=false;
			
			for(int i=0;i<arr.length;i++) {
				if(firstFound==false && first==arr[i]) {
					firstFound=true;
				}
				if(secondFound==false && second==arr[i]) {
					secondFound=true;
				}
			}
			
			if(firstFound && secondFound) {
				System.out.println("Bingo!!!");
			}
			else {
				System.out.println("Not found");
			}
			
		}
		else {
			System.out.println("Entered numbers not in range of 1 to 40");
		}

		

	}
}

import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]) {
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year = scanner.nextInt();

		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0)
					System.out.println("Leap Year");
				else
					System.out.println("Not Leap Year");
			} 
			else { System.out.println("Not Leap Year");}
		}
		else { System.out.println("Not Leap Year");}
	}
}
import java.util.Scanner;

public class OddOrEven {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter the number: ");
		number = scanner.nextInt();

		if(number%2 == 0) {
			System.out.println("Number is Even");
		}
		else if(number%2 != 0) {
			System.out.println("Number is Odd");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
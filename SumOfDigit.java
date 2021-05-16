import java.util.Scanner;
public class SumOfDigit {
	public static void main(String args[]) {

		int number, remainder, sum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");
		number = scanner.nextInt();

		while( number != 0 ) {

			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}

		System.out.println("Sum of given digit is: "+sum);
	}
}
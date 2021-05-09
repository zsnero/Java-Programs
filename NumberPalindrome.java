import java.util.Scanner;
public class NumberPalindrome {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int number, temp, reverse = 0;

		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		temp = number;
		while(number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reversed number is: "+reverse);
		if(reverse == temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}
}